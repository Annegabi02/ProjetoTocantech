/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ALUNOS
 */
public class Precificacao {
    private int idPrecificacao;
    private double aluguel;
    private double energia;
    private double agua;
    private double internet;
    private double imposto;
    private double valorDeCompra;
    private double frete;
    private double salarioDoColaborador;
    private double embalagem;
    private int margemLucro;

    public Precificacao() {}

    public Precificacao(int idPrecificacao, double aluguel, double energia, double agua, double internet, double imposto,
                        double valorDeCompra, double frete, double salarioDoColaborador, double embalagem, int margemLucro) {
        this.idPrecificacao = idPrecificacao;
        this.aluguel = aluguel;
        this.energia = energia;
        this.agua = agua;
        this.internet = internet;
        this.imposto = imposto;
        this.valorDeCompra = valorDeCompra;
        this.frete = frete;
        this.salarioDoColaborador = salarioDoColaborador;
        this.embalagem = embalagem;
        this.margemLucro = margemLucro;
    }

    public int getIdPrecificacao() { return idPrecificacao; }
    public void setIdPrecificacao(int idPrecificacao) { this.idPrecificacao = idPrecificacao; }

    public double getAluguel() { return aluguel; }
    public void setAluguel(double aluguel) { this.aluguel = aluguel; }

    public double getEnergia() { return energia; }
    public void setEnergia(double energia) { this.energia = energia; }

    public double getAgua() { return agua; }
    public void setAgua(double agua) { this.agua = agua; }

    public double getInternet() { return internet; }
    public void setInternet(double internet) { this.internet = internet; }

    public double getImposto() { return imposto; }
    public void setImposto(double imposto) { this.imposto = imposto; }

    public double getValorDeCompra() { return valorDeCompra; }
    public void setValorDeCompra(double valorDeCompra) { this.valorDeCompra = valorDeCompra; }

    public double getFrete() { return frete; }
    public void setFrete(double frete) { this.frete = frete; }

    public double getSalarioDoColaborador() { return salarioDoColaborador; }
    public void setSalarioDoColaborador(double salarioDoColaborador) { this.salarioDoColaborador = salarioDoColaborador; }

    public double getEmbalagem() { return embalagem; }
    public void setEmbalagem(double embalagem) { this.embalagem = embalagem; }

    public int getMargemLucro() { return margemLucro; }
    public void setMargemLucro(int margemLucro) { this.margemLucro = margemLucro; }
}
