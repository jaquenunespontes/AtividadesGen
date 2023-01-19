CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE produtos(
id BIGINT auto_increment,
nome VARCHAR (255),
preco DECIMAL (5,2),
quantidade INT, 
marca VARCHAR(255),

PRIMARY KEY(id)
);

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Camisetas",19.90,5,"Lacoste");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Calças",100.00,5,"Biotipo");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Tênis",200.00,5,"Nike");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Meias",30.00,5,"Puma");

INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Bonés",199.00,5,"Oakley");

SELECT * FROM produtos;

SELECT * FROM produtos WHERE preco > 500;

SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos
SET nome = "Camisetas"
WHERE id=1;

DELETE FROM produtos WHERE id=1;

SET SQL_SAFE_UPDATES =0;




CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE produtos(
id BIGINT auto_increment,
nome VARCHAR (255),
preco DECIMAL (5,2),
quantidade INT, 
marca VARCHAR(255),

PRIMARY KEY(id)
);

INSERT INTO atributos(nome,cpf,salario,email)
VALUES("Maria Silva",12345678985,2900,"Maria@silva.com.br");

INSERT INTO atributos(nome,cpf,salario,email)
VALUES("Helena Oliveira",32565865877,1800,"Helena@oliveira.com.br");

INSERT INTO atributos(nome,cpf,salario,email)
VALUES("Annalize Nunes",32447545869,4000,"annalize@nunes.com.br");

INSERT INTO atributos(nome,cpf,salario,email)
VALUES("Manoel Pontes",24545856986,1500,"manoel@pontes.com.br");

INSERT INTO atributos(nome,cpf,salario,email)
VALUES("Adriano Gonsalves",25448665268,1280,"adiano@gonsalves.com.br");

SELECT * FROM atributos;

SELECT * FROM atributos WHERE salario > 2000;

SELECT * FROM atributos WHERE preco < 2000;

UPDATE atributos
SET nome = "Annalize Nunes"
WHERE id=1;

DELETE FROM atributos WHERE id=1;

SET SQL_SAFE_UPDATES =0;














