--<ScriptOptions statementTerminator=";"/>

-------------------------------------
-- Tabla de definicion de usuarios --
-------------------------------------
CREATE TABLE users (
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	enabled BIT NOT NULL,
	PRIMARY KEY (username)
) ENGINE=InnoDB;
----------------------------------
-- Tabla de definicion de roles --
----------------------------------
CREATE TABLE authorities (
	username VARCHAR(50) NOT NULL,
	authority VARCHAR(50) NOT NULL,
	description VARCHAR(50)
) ENGINE=InnoDB;

CREATE UNIQUE INDEX authorities_idx_1 ON authorities (authority ASC, username ASC);

ALTER TABLE authorities ADD CONSTRAINT fk_authorities_users foreign key (username) REFERENCES users(username) ON DELETE CASCADE;

---------------------
-- Tabla novedades --
---------------------
CREATE TABLE novedades (
	id INT NOT NULL,
	message VARCHAR(50),
	enabled BIT NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB;

------------------------------------
-- Tabla de defincion de mensajes --
------------------------------------
CREATE TABLE mensajes(
	clave VARCHAR(100) NOT NULL,
	valor VARCHAR(100) NOT NULL,
	PRIMARY KEY (clave)
) ENGINE=InnoDB;

------------------------
-- Tabla de productos --
------------------------
CREATE TABLE products (
	id INT NOT NULL AUTO_INCREMENT,
	product_name VARCHAR(50),
	price DECIMAL(10,2) DEFAULT 0.00,
	PRIMARY KEY (id)
) ENGINE=InnoDB;