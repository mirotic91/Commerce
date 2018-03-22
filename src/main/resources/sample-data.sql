
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

-- t_product START
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-1,'red','max90',89.9,'2017-12-16 01:12:44');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-2,'blue','max90',89.9,'2017-12-11 11:32:14');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-3,'green','max90',89.9,'2017-12-06 11:32:15');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-4,'white','max90',89.9,'2017-11-26 11:32:16');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-5,'black','max90',89.9,'2017-11-13 16:32:17');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-6,'yellow','max90',89.9,'2017-11-06 11:32:18');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-7,'sky','max90',89.9,'2017-10-22 11:32:19');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-8,'pink','max90',89.9,'2017-10-11 11:32:20');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-9,'orange','max90',89.9,'2017-09-26 19:32:21');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-10,'navy','max90',89.9,'2017-09-16 11:32:21');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-11,'red','max97',99.9,'2017-09-06 11:11:21');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-12,'blue','max97',99.9,'2017-08-30 11:32:24');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-13,'green','max97',99.9,'2017-08-06 11:32:25');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-14,'white','max97',99.9,'2017-07-22 11:32:26');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-15,'black','max97',99.9,'2017-07-07 11:32:27');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-16,'yellow','max97',99.9,'2017-07-06 11:32:28');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-17,'sky','max97',99.9,'2017-06-26 11:32:29');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-18,'pink','max97',99.9,'2017-06-16 11:32:30');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-19,'orange','max97',99.9,'2017-06-08 11:32:31');
INSERT INTO t_product (id,color,name,price,created_date) VALUES (-20,'navy','max97',99.9,'2017-06-06 11:32:32');
-- t_product END

-- t_cart START
INSERT INTO t_cart (id,created_date) VALUES (-1,'2017-12-16 01:12:44');
INSERT INTO t_cart (id,created_date) VALUES (-2,'2017-12-11 11:32:14');
-- t_cart END

-- t_cart_product START
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-1,-1,-1,3,'2017-12-16 01:12:44');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-2,-1,-2,5,'2017-12-11 11:32:14');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-3,-1,-3,1,'2017-12-16 01:12:45');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-4,-1,-4,1,'2017-12-11 11:32:15');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-5,-1,-5,'12','2017-12-16 01:12:46');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-6,-1,-6,2,'2017-12-11 11:32:16');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-7,-2,-1,'1','2017-12-16 01:12:47');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-8,-2,-2,'4','2017-12-11 11:32:17');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-9,-2,-3,'2','2017-12-16 01:12:48');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-10,-2,-10,'3','2017-12-11 11:32:18');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-11,-2,-11,'1','2017-12-16 01:12:49');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-12,-2,-12,'5','2017-12-11 11:32:19');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-13,-2,-13,'3','2017-12-16 01:12:50');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-14,-2,-14,'2','2017-12-11 11:32:20');
INSERT INTO t_cart_product (id,cart_id,product_id,buy_count,created_date) VALUES (-15,-2,-15,'5','2017-12-16 01:12:51');
-- t_cart_product END

