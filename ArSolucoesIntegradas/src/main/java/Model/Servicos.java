/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Servicos {
    private int idServicos;
    private String categoria;
    private String descricao;
    private String horarios;
    private String preco;
    private int precificacaoIdPrecificacao;

    public Servicos() {}

    public Servicos(int idServicos, String categoria, String descricao, String horarios, String preco, int precificacaoIdPrecificacao) {
        this.idServicos = idServicos;
        this.categoria = categoria;
        this.descricao = descricao;
        this.horarios = horarios;
        this.preco = preco;
        this.precificacaoIdPrecificacao = precificacaoIdPrecificacao;
    }

    public int getIdServicos() { return idServicos; }
    public void setIdServicos(int idServicos) { this.idServicos = idServicos; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getHorarios() { return horarios; }
    public void setHorarios(String horarios) { this.horarios = horarios; }

    public String getPreco() { return preco; }
    public void setPreco(String preco) { this.preco = preco; }

    public int getPrecificacaoIdPrecificacao() { return precificacaoIdPrecificacao; }
    public void setPrecificacaoIdPrecificacao(int precificacaoIdPrecificacao) { this.precificacaoIdPrecificacao = precificacaoIdPrecificacao; }
}
