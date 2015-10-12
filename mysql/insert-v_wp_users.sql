insert into `EI-WordPress-01`.`wp_users` (user_login, user_pass, user_nicename, user_email, user_url, user_registered, user_activation_key, user_status, display_name)
 SELECT user_login, user_pass, user_nicename, user_email, user_url, user_registered, user_activation_key, user_status, display_name 
 FROM rtwbeta.v_wp_users
 where rtwbeta.v_wp_users.user_login not in (select user_login from `EI-WordPress-01`.`wp_users`) ;
 
