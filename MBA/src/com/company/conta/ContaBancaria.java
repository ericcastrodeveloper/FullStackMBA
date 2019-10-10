package com.company.conta;

public abstract class ContaBancaria {

    private String titular;
    protected double saldo;
    private int numeroConta;

    public ContaBancaria() {
    }

    public ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double deposita(double valor){
        return this.saldo+=valor;
    }

    public double saque(double valor){
            return this.saldo-=valor;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public abstract String getTipo();
}
