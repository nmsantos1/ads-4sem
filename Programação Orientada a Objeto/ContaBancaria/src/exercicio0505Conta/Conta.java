package exercicio0505Conta;

import java.util.Scanner;

public class Conta {
    private Integer idConta;
    private Integer numConta;
    private String titularConta;
    private Double saldoConta;
    private String tipoConta;

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoCOnta) {
        this.saldoConta = saldoCOnta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    //abrirConta
    void abrirConta(){
        if(getTipoConta() == "C")
            setSaldoConta(getSaldoConta() + 50.00);
        else if (getTipoConta() == "P")
            setSaldoConta(getSaldoConta() + 100.00);
        System.out.println("Conta Aberta!");
        mostrarSaldoConta();
    }
    
    void depositar(Double deposito){
        setSaldoConta(getSaldoConta() + deposito);
    }
    
    void sacar(Double saque){
        setSaldoConta(getSaldoConta() - saque);
    }
    
    void mostrarSaldoConta(){
        System.out.println(getTitularConta() + " \nConta: "+getNumConta()+"\nSaldo atual: " + getSaldoConta());
    }
    
    void fecharConta(){
        if(getSaldoConta() == 0.0)
            System.out.println("Conta fechada!");
        else if(getSaldoConta() > 0.0){
            sacar(getSaldoConta());
            System.out.println("Conta fechada!");
        } else{
            depositar(getSaldoConta() * (-1));
            System.out.println("Conta fechada!");
        }
    }
    //depositar
    //sacar
    //mostrarSaldo
    //fecharConta
}
