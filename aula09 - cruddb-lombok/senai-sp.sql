create database sp_senai;
use sp_senai;

create table aluno (
	id int primary key auto_increment,
    nome varchar(45) not null
);

insert into aluno (nome) values
("Pedro"),
("Anna"),
("Marcio");

select * from aluno
