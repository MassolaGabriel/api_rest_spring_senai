create database mecparts;
use mecparts;

create table fornecedores (
	id_fornecedor int primary key auto_increment,
    nome_fornecedor varchar(255) not null,
    cnpj varchar(18),
    endereco varchar(200),
    telefone varchar(20)
);

create table componentes (
	id_componente int primary key auto_increment,
    nome_componente varchar(100) not null,
    descricao text,
    preco_unitario decimal(10,2),
    quantidade_estoque int
);

create table componentes_fornecedores(
	id_componente int,
	id_fornecedor int
);

create table ordens_producao(
	id_ordem int primary key auto_increment,
    data_criacao date,
    componente_id int,
    quantidade_solicitada int,
    status varchar(20)
);

alter table componentes_fornecedores
add foreign key (id_componente) references componentes(id_componente);

alter table componentes_fornecedores
add foreign key (id_fornecedor) references fornecedores(id_fornecedor);

alter table ordens_producao
add foreign key (componente_id) references componentes(id_componente);

desc componentes_fornecedores