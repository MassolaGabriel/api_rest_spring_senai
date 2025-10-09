create database controle_estoque;
use controle_estoque;

desc materias_primas;

create table materias_primas(
	id int primary key auto_increment,
    nome_material varchar(255) not null,
    quantidade int,
    data_entrada date
);
 -- Adicione uma coluna fornecedor (texto) à tabela materias_primas.
alter table materias_primas add column fornecedor text;

--  Modifique a coluna quantidade para aceitar até 6 dígitos.
alter table materias_primas modify column quantidade char(6);

-- Altere o nome da coluna nome_material para descricao_material.
alter table materias_primas rename column nome_material to descricao_material;

-- Renomeie a tabela materias_primas para estoque_materiais.
alter table materias_primas rename to estoque_materiais;

-- Limpe todos os dados da tabela estoque_materiais, mantendo sua estrutura.
truncate estoque_materiais;

-- Exclua a tabela estoque_materiais ao final do exercício.
drop table estoque_materiais;