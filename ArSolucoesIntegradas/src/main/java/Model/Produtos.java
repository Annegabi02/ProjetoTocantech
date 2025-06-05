/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Produtos {
    private int idProdutos;
    private String quantidade;
    private String descricao;
    private String validade;
    private String preco;
    private String codigo;
    private int precificacaoIdPrecificacao;

    public Produtos() {}

    public Produtos(int idProdutos, String quantidade, String descricao, String validade, String preco, String codigo, int precificacaoIdPrecificacao) {
        this.idProdutos = idProdutos;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.validade = validade;
        this.preco = preco;
        this.codigo = codigo;
        this.precificacaoIdPrecificacao = precificacaoIdPrecificacao;
    }

    public int getIdProdutos() { return idProdutos; }
    public void setIdProdutos(int idProdutos) { this.idProdutos = idProdutos; }

    public String getQuantidade() { return quantidade; }
    public void setQuantidade(String quantidade) { this.quantidade = quantidade; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public int getPrecificacaoIdPrecificacao() { return precificacaoIdPrecificacao; }
    public void setPrecificacaoIdPrecificacao(int precificacaoIdPrecificacao) { this.precificacaoIdPrecificacao = precificacaoIdPrecificacao; }
}
