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
    private int idusuario;
    private String idcpf;
    private String datadenascimento;

    public Usuario() {}

    public Usuario(int idusuario, String idcpf, String datadenascimento) {
        this.idusuario = idusuario;
        this.idcpf = idcpf;
        this.datadenascimento = datadenascimento;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdcpf() {
        return idcpf;
    }

    public void setIdcpf(String idcpf) {
        this.idcpf = idcpf;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }
}
