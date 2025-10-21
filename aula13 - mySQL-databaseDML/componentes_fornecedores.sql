SELECT * FROM mecparts.componentes_fornecedores;

select * from componentes_fornecedores cf
join componentes c on cf.id_componente = c.id_componente
join fornecedores f on f.id_fornecedor = cf.id_fornecedor;

select 
	nome_componente,
    preco_unitario,
    quantidade_estoque,
    preco_unitario * quantidade_estoque as total
from componentes_fornecedores cf
join componentes c on cf.id_componente = c.id_componente
join fornecedores f on f.id_fornecedor = cf.id_fornecedor
where nome_componente like "%P%";

select 
   sum(preco_unitario * quantidade_estoque) as total
from componentes_fornecedores cf
join componentes c on cf.id_componente = c.id_componente
join fornecedores f on f.id_fornecedor = cf.id_fornecedor
where nome_componente like "%P%";

select 
	nome_fornecedor,
   sum(preco_unitario * quantidade_estoque) as total
from componentes_fornecedores cf
join componentes c on cf.id_componente = c.id_componente
join fornecedores f on f.id_fornecedor = cf.id_fornecedor
group by nome_fornecedor
order by total desc
;