-- INSERCION DE DATOS --
-- DATOS DE USUARIOS --
INSERT INTO users(username, password, enabled) VALUES ('admin', 'admin', TRUE);
INSERT INTO users(username, password, enabled) VALUES ('dba', 'dba', TRUE);
INSERT INTO users(username, password, enabled) VALUES ('jclopezg', '123456', TRUE);
INSERT INTO users(username, password, enabled) VALUES ('edit', 'edit', TRUE);
-- DATOS DE AUTORIZACION --
INSERT INTO authorities(username, authority, description) VALUES ('admin', 'ROLE_ADMIN', 'Perfil de administrador');
INSERT INTO authorities(username, authority, description) VALUES ('dba', 'ROLE_DBA', 'Perfil de adminsitrador de BB.DD.');
INSERT INTO authorities(username, authority, description) VALUES ('jclopezg', 'ROLE_USER', 'Perfil de usuario normal');
INSERT INTO authorities(username, authority, description) VALUES ('admin', 'ROLE_USER', 'Perfil de usuario normal');
INSERT INTO authorities(username, authority, description) VALUES ('edit', 'ROLE_EDIT', 'Perfil de editor del portal');
-- DATOS DE NOVEDADES --
INSERT INTO novedades(id, message, enabled) VALUES (1, 'Creacion del portal', TRUE);
INSERT INTO novedades(id, message, enabled) VALUES (2, 'Alta de usuarios', TRUE);
-- DATOS DE MENSAJES --
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.hello.title','Bienvenido');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.hello.message','Este es tu nuevo portal');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.admin.title','Administraci&oacute;n');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.admin.message','This is a protected page - Admin Page!');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.config.title','Configuraci&oacute;n');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.config.message','P&aacute;gina de Configuraci&oacute;n');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.product.title','Productos');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.product.message','P&aacute;gina de Productos');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.galeria.title','Galer&iacute;a');
INSERT INTO mensajes(clave, valor) VALUES ('com.formacion.imagina.galeria.message','Galer&iacute;a de Im&aacute;genes');
-- DATOS DE PRODUCTOS --
INSERT INTO products(product_name, price) VALUES ('Producto 1', 10.25);
INSERT INTO products(product_name, price) VALUES ('Producto 2', 12.73);
INSERT INTO products(product_name, price) VALUES ('Producto 3', 33.33);
INSERT INTO products(product_name, price) VALUES ('Producto 4', 444.44);
INSERT INTO products(product_name, price) VALUES ('Producto 5', 55.55);
INSERT INTO products(product_name, price) VALUES ('Producto 6', 66.66);
INSERT INTO products(product_name, price) VALUES ('Producto 7', 7700700.77);