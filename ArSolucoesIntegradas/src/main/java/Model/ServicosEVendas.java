/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class ServicosEVendas {
    private int idservicos_has_vendas;
    private int idservicos;
    private int idvendas;

    public ServicosEVendas() {}

    public ServicosEVendas(int idservicos_has_vendas, int idservicos, int idvendas) {
        this.idservicos_has_vendas = idservicos_has_vendas;
        this.idservicos = idservicos;
        this.idvendas = idvendas;
    }

    public int getIdservicos_has_vendas() {
        return idservicos_has_vendas;
    }

    public void setIdservicos_has_vendas(int idservicos_has_vendas) {
        this.idservicos_has_vendas = idservicos_has_vendas;
    }

    public int getIdservicos() {
        return idservicos;
    }

    public void setIdservicos(int idservicos) {
        this.idservicos = idservicos;
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }
    
}

