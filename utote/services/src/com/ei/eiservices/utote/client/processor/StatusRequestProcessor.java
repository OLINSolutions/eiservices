
/**
 * ProgramServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package com.ei.eiservices.utote.client.processor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.apache.axis2.AxisFault;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ei.eiservices.utote.Configurator;
import com.ei.eiservices.utote.UtoteRequestResponseLogger;
import com.ei.eiservices.utote.client.totestatusservice.ToteStatusServiceStub;
import com.ei.eiservices.utote.client.totestatusservice.ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage;
import com.ei.eiservices.utote.client.totestatusservice.ToteStatus_GetToteStatus_ValidationFaultFault_FaultMessage;

/*
 *  ProgramServiceTest Junit test case
 */

public class StatusRequestProcessor {

    private static final Logger log4j = LogManager.getLogger(StatusRequestProcessor.class.getName());


    private static ToteStatusServiceStub.Source getSource() {
        ToteStatusServiceStub.Source source = new ToteStatusServiceStub.Source();
        source.setSystemId(Configurator.getSystemId());
        source.setSourceId(Configurator.getSourceId());
        return source;
    }


    public static final Object monitor = new Object();
    public static boolean monitorState = false;

    public static void unlockWaiter() {
        synchronized (monitor) {
            monitorState = false;
            monitor.notifyAll(); // unlock again
        }
    }

    public static void waitForThread() {
        monitorState = true;
        while (monitorState) {
            synchronized (monitor) {
                try {
                    monitor.wait(); // wait until notified
                } catch (Exception e) {}
            }
        }
    }

    public static final Object monitor2 = new Object();
    volatile static boolean toteStatusOkay = false;

    public static boolean waitForToteStatusOkay() throws Exception {

        class ToteStatusCaller implements Runnable {

            @Override
            public void run() {

                log4j.entry();
                log4j.trace("ToteStatusCaller.run - Entering");

                synchronized (monitor2) {
                    log4j.trace("ToteStatusCaller.run - In synchronized(monitor2) at Entry");
                    if (toteStatusOkay) {
                        log4j.trace("\tAlready recieved toteStatusOkay, exiting.");
                        return;
                    }
                }

                ToteStatusServiceStub.GetToteStatusResponse sResponse = null;
                ToteStatusServiceStub.ToteLinkResponse statusResult = null;
                int requestLogId = 0;
                int responseLogId = 0;

                // Make get status call
                // Setup call
                log4j.debug("ToteStatusCaller.run - Settting up Tote Status Request call");
                sResponse = null;
                statusResult = null;
                ToteStatusServiceStub stub = null;
                try {
                    stub = new ToteStatusServiceStub();
                } catch (AxisFault e) {
                    log4j.error("ToteStatusCaller.run - AxisFault creating ToteLink status service stub - "+e.getMessage(),e);
                } catch (Exception e) {
                    log4j.error("ToteStatusCaller.run - General exception creating ToteLink status service stub - "+e.getMessage(),e);
                }

                ToteStatusServiceStub.GetToteStatus getToteStatusInput = new ToteStatusServiceStub.GetToteStatus();
                ToteStatusServiceStub.ToteStatusRequest request = new ToteStatusServiceStub.ToteStatusRequest();
                request.setSource(getSource());
                getToteStatusInput.setToteStatusRequest(request);
                log4j.trace("ToteStatusCaller.run - GetToteStatus={}",getToteStatusInput.toString());
                log4j.trace("ToteStatusCaller.run - ToteStatusRequest={}",request.toString());

                // Log the request
                requestLogId = UtoteRequestResponseLogger.saveToteStatusRequest(getToteStatusInput);

                // Make the call
                try {
                    sResponse = stub.getToteStatus(getToteStatusInput);
                } catch (ToteStatus_GetToteStatus_ValidationFaultFault_FaultMessage e) {
                    log4j.error("ToteStatusCaller.run - ToteStatus_GetToteStatus_ValidationFaultFault_FaultMessage getting ToteLink status - "+e.getMessage(),e);
                } catch (ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage e) {
                    log4j.info("ToteStatusCaller.run - ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage getting ToteLink status.  This is expected while waiting for Tote to come up.\n"+e.getMessage());
                    log4j.trace("ToteStatusCaller.run - ToteStatus_GetToteStatus_ToteFaultFault_FaultMessage getting ToteLink status",e);
                } catch (AxisFault e) {
                    log4j.error("ToteStatusCaller.run - AxisFault getting ToteLink status - "+e.getMessage(),e);
                } catch (Exception e) {
                    log4j.error("ToteStatusCaller.run - General exception getting ToteLink status - "+e.getMessage(),e);
                }

                if (null != sResponse) {
                    // Log the response
                    responseLogId = UtoteRequestResponseLogger.saveToteStatusResponse(requestLogId, sResponse);
                    log4j.debug("ToteStatusCaller.run - New responseLog id = {}",responseLogId);
                }

                if ((null != sResponse) && sResponse.isGetToteStatusResultSpecified()) {

                    // Get the response
                    statusResult = sResponse.getGetToteStatusResult();

                    // Check for error
                    if (statusResult.isErrorSpecified()) {
                        log4j.debug("ToteStatusCaller.run - Error response from GetToteStatus. ",statusResult.getError().toString());
                    }

                    // Since we got a response, and there was no error object
                    // verify that our Source object was returned
                    if (statusResult.isSourceSpecified()) {
                        log4j.debug("ToteStatusCaller.run - statusResult:");
                        log4j.debug("\tSource (Source Id/System Id): {}/{}", statusResult.getSource().getSourceId(), statusResult.getSource().getSystemId());
                        synchronized (monitor2) {
                            log4j.trace("ToteStatusCaller.run - In synchronized(monitor2)");
                            toteStatusOkay = true;
                        }
                        unlockWaiter();
                    }

                } else {
                    log4j.debug("ToteStatusCaller.run - No valid response returned from GetToteStatus yet.");
                }

                log4j.trace("ToteStatusCaller.run - leaving");
                log4j.exit();
            }
        }

        log4j.entry();
        toteStatusOkay = false;

        // Create instance of executor service
        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        // Schedule the tote status call for once per minute
        final ScheduledFuture<?> toteStatusHandle =  executorService.scheduleWithFixedDelay(new ToteStatusCaller(), 0, 1, TimeUnit.MINUTES);

        // Setup a 60 minute timer as a backup
        final ScheduledFuture<?> toteKillerHandle = executorService.schedule(new Runnable() {
            @Override
            public void run() {
                if (!toteStatusHandle.isDone()) {
                    toteStatusHandle.cancel(true);
                }
                unlockWaiter();
            }
        }, 60, TimeUnit.MINUTES);

        // Wait for success or cancelled
        waitForThread();
        log4j.trace("waitForStatusOkay - ToteStatusCaller has completed.");
        if (!toteStatusHandle.isDone()) {
            log4j.trace("waitForStatusOkay - toteStatusHandle not done, cancelling.");
            toteStatusHandle.cancel(true);
        }
        if (!toteKillerHandle.isDone()) {
            log4j.trace("waitForStatusOkay - toteKillerHandle not done, cancelling.");
            toteKillerHandle.cancel(true);
        }

        log4j.exit(toteStatusOkay);
        return toteStatusOkay;
    }
}
