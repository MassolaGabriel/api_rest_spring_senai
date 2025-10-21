-- ============================================
-- SCRIPT DE CARGA DE DADOS - MECPARTS
-- Objetivo: Gerar volume de dados para análise
-- ============================================

USE mecparts;

-- Limpar dados existentes (opcional - comentar se quiser manter dados atuais)
-- DELETE FROM ordens_producao;
-- DELETE FROM componentes_fornecedores;
-- DELETE FROM componentes WHERE id_componente > 8;
-- DELETE FROM fornecedores WHERE id_fornecedor > 5;

-- ============================================
-- 1. INSERÇÃO DE FORNECEDORES ADICIONAIS
-- ============================================

INSERT INTO fornecedores (nome_fornecedor, cnpj, endereco, telefone) VALUES
('Parafusos Industriais ABC', '11.222.333/0001-44', 'Rua Metalúrgica, 450, Guarulhos', '(11) 94444-3333'),
('FastFix Componentes', '22.333.444/0001-55', 'Av. Industrial, 780, Osasco', '(11) 93333-2222'),
('Global Parts Ltda', '33.444.555/0001-66', 'Rua das Máquinas, 120, Jundiaí', '(11) 92222-1111'),
('Precision Metal Works', '44.555.666/0001-77', 'Av. Tecnológica, 890, Barueri', '(11) 91111-0000'),
('Componentes Premium S.A.', '55.666.777/0001-88', 'Rua da Precisão, 340, São Caetano', '(11) 90000-9999'),
('TechParts Distribuidora', '66.777.888/0001-99', 'Av. dos Fornecedores, 560, Mauá', '(11) 98888-8888'),
('Metalúrgica São José', '77.888.999/0001-00', 'Rua Industrial Sul, 210, Ribeirão Pires', '(11) 97777-7777'),
('AutoMetal Brasil', '88.999.000/0001-11', 'Av. das Autopeças, 670, Mogi das Cruzes', '(11) 96666-6666'),
('Indústria Fortex', '99.000.111/0001-22', 'Rua dos Metais, 150, Suzano', '(11) 95555-5555'),
('MegaParts Comercial', '10.111.222/0001-33', 'Av. Logística, 890, Itaquaquecetuba', '(11) 94444-4444');

-- ============================================
-- 2. INSERÇÃO DE COMPONENTES ADICIONAIS
-- ============================================

INSERT INTO componentes (nome_componente, descricao, preco_unitario, quantidade_estoque) VALUES
('Parafuso Sextavado M8x30', 'Parafuso de aço carbono zincado', 1.50, 7500),
('Arruela Lisa M10', 'Arruela de aço zincado', 0.40, 12000),
('Porca Autotravante M8', 'Porca com nylon de travamento', 0.85, 8500),
('Rebite Pop 4.8x12mm', 'Rebite de alumínio cabeça larga', 0.30, 15000),
('Parafuso Flangeado M6x16', 'Parafuso com flange integrado', 1.10, 6500),
('Bucha Plástica S8', 'Bucha de nylon para fixação', 0.20, 20000),
('Arruela de Pressão M10', 'Arruela de segurança ondulada', 0.60, 9000),
('Pino Cilíndrico 8x40mm', 'Pino de aço temperado', 2.50, 2500),
('Parafuso Allen M8x25', 'Parafuso cabeça cilíndrica', 1.80, 5500),
('Chaveta Paralela 6x6x30', 'Chaveta de aço carbono', 1.95, 3000),
('Anel Elástico Ext 25mm', 'Anel de retenção externo', 0.55, 6000),
('Parafuso Cabeça Chata M4x12', 'Parafuso inox fenda Phillips', 0.70, 8000),
('Rebite de Aço 5x16mm', 'Rebite sólido de aço', 0.45, 10000),
('Porca Borboleta M6', 'Porca manual zincada', 1.25, 4000),
('Arruela de Cobre M8', 'Arruela para vedação', 0.95, 3500),
('Parafuso Autoatarraxante 4.2x16', 'Parafuso para chapa', 0.35, 18000),
('Bucha de Latão 10x12x15', 'Bucha deslizante', 4.20, 1500),
('Pino Cônico 8x50mm', 'Pino de centragem', 3.10, 2000),
('Anel O-Ring NBR 15mm', 'Anel de vedação', 0.25, 12000),
('Parafuso Flangeado M8x20', 'Parafuso flange zincado', 1.40, 7000),
('Arruela de Nylon M6', 'Arruela isolante', 0.15, 15000),
('Rebite Tubular 4x8mm', 'Rebite oco de alumínio', 0.20, 16000),
('Parafuso Prisioneiro M10x40', 'Parafuso rosca total', 2.20, 3500),
('Porca Sextavada Alta M8', 'Porca alongada', 0.90, 7500),
('Chaveta Meia Lua 8mm', 'Chaveta Woodruff', 2.80, 1800),
('Anel de Trava Interno 20mm', 'Anel de segurança interno', 0.65, 5500),
('Parafuso Cabeça Panela M5x20', 'Parafuso Phillips zincado', 0.80, 9500),
('Bucha de Teflon 12x16x20', 'Bucha autolubrificante', 6.50, 800),
('Pino Estriado 10x50mm', 'Pino ranhurado', 3.80, 1200),
('Arruela Dentada Interna M8', 'Arruela de travamento', 0.50, 10000);

-- ============================================
-- 3. ASSOCIAÇÃO COMPONENTES-FORNECEDORES
-- ============================================

-- Distribuir componentes entre fornecedores (múltiplos fornecedores por componente)
INSERT INTO componentes_fornecedores (id_componente, id_fornecedor) VALUES
(1, 6), (1, 8), (2, 7), (2, 9), (3, 6), (3, 10), (9, 1), (9, 6), (9, 10),
(10, 2), (10, 7), (11, 1), (11, 8), (11, 10), (12, 3), (12, 9), (13, 4), 
(13, 10), (14, 5), (14, 10), (15, 6), (15, 10), (16, 7), (16, 10), (17, 1), 
(17, 8), (18, 2), (18, 9), (18, 10), (19, 3), (19, 10), (20, 4), (20, 10),
(21, 5), (21, 10), (22, 6), (22, 10), (23, 7), (23, 1), (24, 8), (24, 2), 
(24, 10), (25, 9), (25, 3), (26, 10), (26, 4), (27, 10), (27, 5),
(28, 10), (28, 6), (29, 10), (29, 7), (30, 10), (30, 8);

-- ============================================
-- 4. ORDENS DE PRODUÇÃO - VOLUME GRANDE
-- ============================================

-- Mês 1 - Setembro/2025 (30 ordens)
INSERT INTO ordens_producao (data_criacao, id_componente, quantidade_solicitada, status, responsavel) VALUES
('2025-09-01', 9, 2500, 'Concluído', 'Equipe Produção'),
('2025-09-02', 12, 5000, 'Concluído', 'Equipe Produção'),
('2025-09-03', 15, 1800, 'Concluído', 'Equipe Produção'),
('2025-09-04', 18, 3200, 'Concluído', 'Equipe Produção'),
('2025-09-05', 21, 4500, 'Concluído', 'Equipe Produção'),
('2025-09-06', 24, 2200, 'Concluído', 'Equipe Produção'),
('2025-09-07', 27, 1500, 'Concluído', 'Equipe Produção'),
('2025-09-08', 30, 6000, 'Concluído', 'Equipe Produção'),
('2025-09-09', 11, 3800, 'Concluído', 'Equipe Produção'),
('2025-09-10', 14, 2900, 'Concluído', 'Equipe Produção'),
('2025-09-11', 17, 4100, 'Concluído', 'Equipe Produção'),
('2025-09-12', 20, 3300, 'Concluído', 'Equipe Produção'),
('2025-09-13', 23, 2700, 'Concluído', 'Equipe Produção'),
('2025-09-14', 26, 1900, 'Concluído', 'Equipe Produção'),
('2025-09-15', 29, 5500, 'Concluído', 'Equipe Produção'),
('2025-09-18', 10, 7000, 'Concluído', 'Equipe Produção'),
('2025-09-19', 13, 4200, 'Concluído', 'Equipe Produção'),
('2025-09-20', 16, 3000, 'Concluído', 'Equipe Produção'),
('2025-09-21', 19, 5200, 'Concluído', 'Equipe Produção'),
('2025-09-22', 22, 8000, 'Concluído', 'Equipe Produção'),
('2025-09-23', 25, 1600, 'Concluído', 'Equipe Produção'),
('2025-09-24', 28, 2100, 'Concluído', 'Equipe Produção'),
('2025-09-28', 1, 12000, 'Concluído', 'Equipe Produção'),
('2025-09-29', 3, 6500, 'Concluído', 'Equipe Produção'),
('2025-09-30', 5, 2000, 'Concluído', 'Equipe Produção');


-- Mês 2 - Outubro/2025 - Primeira Quinzena (15 ordens concluídas)
INSERT INTO ordens_producao (data_criacao, id_componente, quantidade_solicitada, status, responsavel) VALUES
('2025-10-01', 7, 3500, 'Concluído', 'Equipe Produção'),
('2025-10-02', 9, 4200, 'Concluído', 'Equipe Produção'),
('2025-10-03', 12, 6000, 'Concluído', 'Equipe Produção'),
('2025-10-04', 15, 2500, 'Concluído', 'Equipe Produção'),
('2025-10-05', 18, 4800, 'Concluído', 'Equipe Produção'),
('2025-10-06', 21, 7200, 'Concluído', 'Equipe Produção'),
('2025-10-07', 24, 3100, 'Concluído', 'Equipe Produção'),
('2025-10-08', 27, 1800, 'Concluído', 'Equipe Produção'),
('2025-10-09', 30, 9000, 'Concluído', 'Equipe Produção'),
('2025-10-10', 11, 5500, 'Concluído', 'Equipe Produção'),
('2025-10-11', 14, 3800, 'Concluído', 'Equipe Produção'),
('2025-10-12', 17, 4600, 'Concluído', 'Equipe Produção'),
('2025-10-13', 20, 5900, 'Concluído', 'Equipe Produção'),
('2025-10-14', 23, 2900, 'Concluído', 'Equipe Produção'),
('2025-10-15', 26, 2200, 'Concluído', 'Equipe Produção');


-- Outubro/2025 - Segunda Quinzena (20 ordens em produção e pendentes)
INSERT INTO ordens_producao (data_criacao, id_componente, quantidade_solicitada, status, responsavel) VALUES
('2025-10-16', 29, 8500, 'Em Produção', 'Equipe Produção'),
('2025-10-17', 10, 11000, 'Em Produção', 'Equipe Produção'),
('2025-10-18', 13, 6800, 'Em Produção', 'Equipe Produção'),
('2025-10-18', 16, 4500, 'Pendente', 'Equipe Produção'),
('2025-10-19', 19, 9200, 'Pendente', 'Equipe Produção'),
('2025-10-19', 22, 15000, 'Pendente', 'Equipe Produção'),
('2025-10-20', 25, 2800, 'Pendente', 'Equipe Produção'),
('2025-10-20', 28, 1400, 'Pendente', 'Equipe Produção'),
('2025-10-22', 1, 18000, 'Pendente', 'Equipe Produção'),
('2025-10-23', 3, 9500, 'Pendente', 'Equipe Produção'),
('2025-10-23', 5, 3200, 'Pendente', 'Equipe Produção'),
('2025-10-24', 8, 6500, 'Pendente', 'Equipe Produção'),
('2025-10-24', 2, 5500, 'Pendente', 'Equipe Produção'),
('2025-10-25', 4, 2100, 'Pendente', 'Equipe Produção'),
('2025-10-25', 6, 1800, 'Pendente', 'Equipe Produção');

-- Ordens Canceladas (simulando 5% de cancelamento)
INSERT INTO ordens_producao (data_criacao, id_componente, quantidade_solicitada, status, responsavel) VALUES
('2025-09-15', 23, 3000, 'Cancelado', 'Equipe Produção'),
('2025-09-22', 26, 2500, 'Cancelado', 'Equipe Produção'),
('2025-10-05', 28, 1900, 'Cancelado', 'Equipe Produção'),
('2025-10-12', 11, 4000, 'Cancelado', 'Equipe Produção');

-- ============================================
-- FIM DO SCRIPT
-- ============================================