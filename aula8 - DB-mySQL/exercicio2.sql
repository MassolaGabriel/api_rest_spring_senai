create database gestao_industrial;
use gestao_industrial;

/*
Crie uma tabela chamada departamentos com os campos:
id (inteiro, chave primária, auto_increment)
nome_departamento (texto, obrigatório)
*/

create table departamentos (
	id int primary key auto_increment,
    nome_departamento text not null
);

/*Crie uma tabela chamada funcionarios com os campos:
id (inteiro, chave primária, auto_increment)
nome (texto, obrigatório)
departamento_id (inteiro, referência ao departamento)
*/

create table funcionarios (
	id int primary key auto_increment,
    nome varchar(255),
    departamento_id int,
    foreign key (departamento_id) references departamentos(id)
    on delete cascade
);

-- Adicione uma coluna email (texto) à tabela funcionarios.
alter table funcionarios add column email varchar(255);

-- Modifique a coluna nome para aceitar até 80 caracteres.
alter table funcionarios modify column nome varchar(80);

-- Altere o nome da coluna nome para nome_completo.
alter table funcionarios rename column nome to nome_completo;

-- Renomeie a tabela funcionarios para colaboradores.
alter table funcionarios rename to colaboradores;

-- Limpe todos os dados da tabela colaboradores.
truncate table colaboradores;

-- Exclua a tabela departamentos.
-- deu ruim tenho que colocar on delete cascade
drop table departamentos;
drop table colaboradores;
-- dropando a FK
alter table colaboradores modify column departamento_id int;