
-- t_user START
INSERT INTO t_user (id,username,password) VALUES (-1,'admin','$2a$10$PG3fZhkT9ZPZd5X1eOXVEe3VQoOWmXTgGv0eLU0PmERzcV82xrTBO');
INSERT INTO t_user (id,username,password) VALUES (-2,'user','$2a$10$PG3fZhkT9ZPZd5X1eOXVEe3VQoOWmXTgGv0eLU0PmERzcV82xrTBO');
-- t_user END

-- t_authority START
INSERT INTO t_authority (id,authority) VALUES (1,'ADMIN');
INSERT INTO t_authority (id,authority) VALUES (2,'USER');
-- t_authority END

-- t_user_authority START
INSERT INTO t_user_authority (user_id,authority_id) VALUES (-1,1);
INSERT INTO t_user_authority (user_id,authority_id) VALUES (-2,2);
-- t_user_authority END

