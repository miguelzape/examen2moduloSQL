DROP TABLE IF EXISTS TB_Productos;


CREATE TABLE TB_Productos (
    id            INTEGER AUTO_INCREMENT COMMENT 'identificador autoincrementable',
    nombre        VARCHAR(30)NOT NULL,
    tipo          ENUM("Alimentación","Electrónica","Ropa")NOT NULL,
    precios       DECIMAL NOT NULL,
    stock         INTEGER NOT NULL,
    PRIMARY KEY(id)
);