/**
 * 
 */
package com.ei.eiservices.utote.jpa;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jordanolin
 *
 */
public class UtoteUpdateTest {

	public static final String PERSISTENCE_UNIT_NAME = "UtoteServices";
	private static final Logger log4j = LogManager.getLogger(UtoteUpdateTest.class.getName());
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ei.eiservices.utote.model.UtoteUpdate#UtoteUpdate()}.
	 */
	@Test
	public void testUtoteUpdate() {
		
		log4j.trace("This is a trace message.");
		log4j.debug("This is  a debug message.");
		log4j.info("This is an info message.");
		log4j.error("This is an error message");
		
		if (1 == 1) {
			return;
		}
		// Create Entity Manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();    		
		
		// Read the existing UToteUpdate entries and write to console
        Query q = em.createQuery("SELECT u FROM UtoteUpdate u");
        List<UtoteUpdate> updateList = q.getResultList();
        for (UtoteUpdate anUpdate : updateList) {
             System.out.println("anUpdate.getSiteId()="+anUpdate.getSiteId());
        }
        System.out.println("updateList Size: " + updateList.size());

        // Read the existing UToteStatusChange entries and write to console
        q = em.createQuery("SELECT c FROM UtoteStatusChange c");
        List<UtoteStatusChange> changeList = q.getResultList();
        for (UtoteStatusChange aChange : changeList) {
             System.out.println("aChange.getSiteId()="+aChange.getSiteId());
        }
        System.out.println("changeList Size: " + changeList.size());
        
        // Insert a new UtoteStatusChange
        // Create new user
        em.getTransaction().begin();
        UtoteStatusChange statusChange = new UtoteStatusChange();
        statusChange.setSiteId("CHD");
        statusChange.setRunId("RunId2");
        statusChange.setMessageTime(Timestamp.valueOf(LocalDateTime.now()));
        statusChange.setTransactionTime(Timestamp.valueOf(LocalDateTime.now()));
        statusChange.setAction("start");
        em.persist(statusChange);
        em.getTransaction().commit();
        System.out.println("The id just generated is "+statusChange.getIdUtoteStatusChange());

        // Read the existing UToteStatusChange entries and write to console
        q = em.createQuery("SELECT c FROM UtoteStatusChange c");
        changeList = q.getResultList();
        for (UtoteStatusChange aChange : changeList) {
             System.out.println("aChange.getSiteId()="+aChange.getSiteId());
        }
        System.out.println("changeList Size: " + changeList.size());
        
        em.close();

        // Close the connections
        em.close();
	}

}
