/*  Seção 1: Fornecedores e Componentes Fornecidos
Para cada fornecedor, exiba:
Nome do fornecedor
CNPJ
Quantidade total de componentes diferentes que ele fornece
Lista dos componentes fornecidos (nome)
*/

select 
	f.nome_fornecedor,
    f.cnpj,
    count(distinct cf.id_componente) as total_componentes,
    group_concat(c.nome_componente separator", ") as componentes_fornecidos
from
  fornecedores f
join
  componentes_fornecedores cf 
on 
	f.id_fornecedor = cf.id_fornecedor
join
  componentes c 
on 
	cf.id_componente = c.id_componente
group by
  f.nome_fornecedor,
  f.cnpj;

/*
Seção 2: Componentes Mais Solicitados em Produção
Nome do componente
Quantidade total solicitada em todas as ordens de produção
Valor total estimado (quantidade solicitada × preço unitário)
Número de ordens de produção que solicitaram esse componente
*/

select 
c.nome_componente,
sum(op.quantidade_solicitada) as quantidade_total_solicitado,
sum(op.quantidade_solicitada) * c.preco_unitario as valor_total_estimado,

count(op.id_ordem) as numero_ordens
from
componentes as c
join
ordens_producao as op
on
op.id_componente = c.id_componente
group by
c.nome_componente,
c.preco_unitario
;

/* 
 Seção 3: Status das Ordens de Produção
Agrupe as ordens por status e mostre:
Status (Pendente, Em Produção, Concluído, etc.)
Quantidade de ordens nesse status
Valor total de componentes envolvidos nessas ordens
*/

select 
	op.status,
    count(op.id_ordem) as quantidade_ordens,
    sum(op.quantidade_solicitada * c.preco_unitario) as valor_total
from
	ordens_producao as op
join
	componentes c
on
	op.id_componente = c.id_componente
group by
	op.status
;

/*
Seção 4: Componentes em Estoque Crítico
Liste componentes onde:
Quantidade em estoque < quantidade total solicitada em ordens "Pendentes"
Exiba: nome, quantidade atual, quantidade necessária, diferença (falta)
*/

select
c.nome_componente,
c.quantidade_estoque as quantidade_atual,
op.quantidade_solicitada as quantidade_necessaria,
min( op.quantidade_solicitada - c.quantidade_estoque) as diferenca 
from
componentes as c
join
ordens_producao as op
on
op.id_componente = c.id_componente
group by
c.nome_componente,
op.quantidade_solicitada
;