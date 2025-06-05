/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Vendas {
    private int idVendas;
    private String data;
    private String categoria;
    private double preco;
    private String formaDePagamento;
    private Integer clienteIdCliente;
    private Integer produtosIdProdutos;
    private Integer servicosIdServicos;

    public Vendas() {}

    public Vendas(int idVendas, String data, String categoria, double preco, String formaDePagamento, Integer clienteIdCliente, Integer produtosIdProdutos, Integer servicosIdServicos) {
        this.idVendas = idVendas;
        this.data = data;
        this.categoria = categoria;
        this.preco = preco;
        this.formaDePagamento = formaDePagamento;
        this.clienteIdCliente = clienteIdCliente;
        this.produtosIdProdutos = produtosIdProdutos;
        this.servicosIdServicos = servicosIdServicos;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Integer getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(Integer clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    public Integer getProdutosIdProdutos() {
        return produtosIdProdutos;
    }

    public void setProdutosIdProdutos(Integer produtosIdProdutos) {
        this.produtosIdProdutos = produtosIdProdutos;
    }

    public Integer getServicosIdServicos() {
        return servicosIdServicos;
    }

    public void setServicosIdServicos(Integer servicosIdServicos) {
        this.servicosIdServicos = servicosIdServicos;
    }

    
   }