/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Usuario {
    private int idUsuario;
    private String CPF;
    private String DataDeNascimento;

    public Usuario() {}

    public Usuario(int idUsuario, String CPF, String DataDeNascimento) {
        this.idUsuario = idUsuario;
        this.CPF = CPF;
        this.DataDeNascimento = DataDeNascimento;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getCPF() { return CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    public String getDataDeNascimento() { return DataDeNascimento; }
    public void setDataDeNascimento(String DataDeNascimento) { this.DataDeNascimento = DataDeNascimento; }
}
