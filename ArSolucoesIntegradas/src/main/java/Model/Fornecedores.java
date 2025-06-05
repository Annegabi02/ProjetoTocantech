/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Fornecedores {
    private int idFornecedores;
    private String nome;
    private String cnpj_cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Fornecedores() {}

    public Fornecedores(int idFornecedores, String nome, String cnpj_cpf, String telefone, String email, String endereco) {
        this.idFornecedores = idFornecedores;
        this.nome = nome;
        this.cnpj_cpf = cnpj_cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getIdFornecedores() { return idFornecedores; }
    public void setIdFornecedores(int idFornecedores) { this.idFornecedores = idFornecedores; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCnpj_cpf() { return cnpj_cpf; }
    public void setCnpj_cpf(String cnpj_cpf) { this.cnpj_cpf = cnpj_cpf; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
}
