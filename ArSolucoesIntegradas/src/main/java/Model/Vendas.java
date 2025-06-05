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
    private String produtosOUservicos;
    private String origem;
    private String categoria;
    private String preco;

    public Vendas() {}

    public Vendas(int idVendas, String data, String produtosOUservicos, String origem, String categoria, String preco) {
        this.idVendas = idVendas;
        this.data = data;
        this.produtosOUservicos = produtosOUservicos;
        this.origem = origem;
        this.categoria = categoria;
        this.preco = preco;
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

    public String getProdutosOUservicos() {
        return produtosOUservicos;
    }

    public void setProdutosOUservicos(String produtosOUservicos) {
        this.produtosOUservicos = produtosOUservicos;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
