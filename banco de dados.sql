-- Comando de criação do banco de dados
create database sistemaARsolucoesintegradas;
-- comando para me permitir usar o banco de dados
use sistemaArsolucoesintegradas;

-- =================== TABELAS BÁSICAS ===================

-- Usuario
CREATE TABLE IF NOT EXISTS usuario (
  idUsuario INT AUTO_INCREMENT PRIMARY KEY,
  CPF VARCHAR(14) DEFAULT NULL,
  DataDeNascimento VARCHAR(14) DEFAULT NULL
) ;

-- Cliente
CREATE TABLE IF NOT EXISTS cliente (
  idCliente INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(45) DEFAULT NULL,
  cpf VARCHAR(45) DEFAULT NULL,
  telefone VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL
) ;

-- Fornecedores
CREATE TABLE IF NOT EXISTS fornecedores (
  idFornecedores INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(45) DEFAULT NULL,
  cnpj_cpf VARCHAR(45) DEFAULT NULL,
  telefone VARCHAR(45) DEFAULT NULL,
  email VARCHAR(45) DEFAULT NULL,
  endereco VARCHAR(45) DEFAULT NULL
) ;

-- Precificação
CREATE TABLE IF NOT EXISTS precificacao (
  idPrecificacao INT AUTO_INCREMENT PRIMARY KEY,
  aluguel DOUBLE DEFAULT NULL,
  energia DOUBLE DEFAULT NULL,
  agua DOUBLE DEFAULT NULL,
  internet DOUBLE DEFAULT NULL,
  imposto DOUBLE DEFAULT NULL,
  valorDeCompra DOUBLE DEFAULT NULL,
  frete DOUBLE DEFAULT NULL,
  salarioDoColaborador DOUBLE DEFAULT NULL,
  embalagem DOUBLE DEFAULT NULL,
  margemLucro INT DEFAULT NULL
) ;

-- Produtos
CREATE TABLE IF NOT EXISTS produtos (
  idProdutos INT AUTO_INCREMENT PRIMARY KEY,
  quantidade VARCHAR(45) DEFAULT NULL,
  descricao VARCHAR(45) DEFAULT NULL,
  validade VARCHAR(45) DEFAULT NULL,
  preco VARCHAR(45) DEFAULT NULL,
  codigo VARCHAR(45) DEFAULT NULL,
  precificacao_idPrecificacao INT NOT NULL,
  FOREIGN KEY (precificacao_idPrecificacao) REFERENCES precificacao(idPrecificacao)
) ;

-- Servicos
CREATE TABLE IF NOT EXISTS servicos (
  idServicos INT AUTO_INCREMENT PRIMARY KEY,
  categoria VARCHAR(45) DEFAULT NULL,
  descricao VARCHAR(45) DEFAULT NULL,
  horarios VARCHAR(45) DEFAULT NULL,
  preco VARCHAR(45) DEFAULT NULL,
  precificacao_idPrecificacao INT NOT NULL,
  FOREIGN KEY (precificacao_idPrecificacao) REFERENCES precificacao(idPrecificacao)
) ;

-- Vendas
CREATE TABLE IF NOT EXISTS vendas (
  idVendas INT AUTO_INCREMENT PRIMARY KEY,
  data VARCHAR(45) DEFAULT NULL,
  categoria VARCHAR(45) DEFAULT NULL,
  preco DOUBLE DEFAULT NULL,
  formaDePagamento VARCHAR(45) DEFAULT NULL,
  Cliente_idCliente INT DEFAULT NULL,
  Produtos_idProdutos INT DEFAULT NULL,
  Servicos_idServicos INT DEFAULT NULL,
  FOREIGN KEY (Cliente_idCliente) REFERENCES cliente(idCliente),
  FOREIGN KEY (Produtos_idProdutos) REFERENCES produtos(idProdutos),
  FOREIGN KEY (Servicos_idServicos) REFERENCES servicos(idServicos)
) ;

-- =================== TABELAS DE RELACIONAMENTO ===================

-- Produtos_has_Fornecedores (igual ao exemplo original)
CREATE TABLE IF NOT EXISTS produtos_has_fornecedores (
  idProdutosHasFornecedores INT AUTO_INCREMENT PRIMARY KEY,
  idprodutos INT,
  idfornecedores INT,
  FOREIGN KEY (idprodutos) REFERENCES produtos(idProdutos),
  FOREIGN KEY (idfornecedores) REFERENCES fornecedores(idFornecedores)
) ;

-- Vendas_has_Produtos
CREATE TABLE IF NOT EXISTS vendas_has_produtos (
  idVendasHasProdutos INT AUTO_INCREMENT PRIMARY KEY,
  idvendas INT,
  idprodutos INT,
  FOREIGN KEY (idvendas) REFERENCES vendas(idVendas),
  FOREIGN KEY (idprodutos) REFERENCES produtos(idProdutos)
) ;

-- Servicos_has_Vendas
CREATE TABLE IF NOT EXISTS servicos_has_vendas (
  idServicosHasVendas INT AUTO_INCREMENT PRIMARY KEY,
  idservicos INT,
  idvendas INT,
  FOREIGN KEY (idservicos) REFERENCES servicos(idServicos),
  FOREIGN KEY (idvendas) REFERENCES vendas(idVendas)
) ;
