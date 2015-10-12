CALL mysql.rds_set_external_master ('172.32.0.139',3306,'repl_user','1229_Cagney','mysql-bin.000001', 18941, 0);

CALL mysql.rds_start_replication;

CALL mysql.rds_stop_replication;

CALL mysql.rds_reset_external_master();

CALL mysql.rds_skip_repl_error;

show slave status;


