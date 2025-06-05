/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Fornecedores  {
    private int idfornecedor;
    private String nome;
    private String cnpjEcpf;
    private String telefone;
    private String endereco;
    private String produtos;
    private String email;

    public Fornecedores () {}

    public Fornecedores (int idfornecedor, String nome, String cnpjEcpf, String telefone, String endereco, String produtos, String email) {
        this.idfornecedor = idfornecedor;
        this.nome = nome;
        this.cnpjEcpf = cnpjEcpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.produtos = produtos;
        this.email = email;
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpjEcpf() {
        return cnpjEcpf;
    }

    public void setCnpjEcpf(String cnpjEcpf) {
        this.cnpjEcpf = cnpjEcpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
