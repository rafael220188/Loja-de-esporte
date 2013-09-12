CREATE TABLE cliente(
cod_cliente integer NOT NULL,
cpf      character varying,
endereco character varying,
nome     character varying,
telefone character varying
);


INSERT INTO cliente (cod_cliente, cpf, endereco, nome, telefone) 
VALUES ('11', '01605574098','rua tal','Fabiana',5112345678);

INSERT INTO cliente (cod_cliente, cpf, endereco, nome, telefone) 
VALUES ('12', '01565498723','rua bento','Alessandra',5198765432);

Select * From cliente 

CREATE TABLE produto(
cod_produto int,
nome_produto varchar(40),
preco numeric(15,2),
quantidade int);


insert into produto (cod_produto, nome_produto, preco, quantidade)
values ('01', 'adidas', '200', '20');

insert into produto (cod_produto, nome_produto, preco, quantidade)
values ('02', 'nike', '250', '30');

Select * From produto

drop table produto
drop table cliente


