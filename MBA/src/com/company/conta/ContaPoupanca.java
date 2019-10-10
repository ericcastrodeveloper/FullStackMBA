package com.company.conta;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String titular, double saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    public String getTipo(){
        return "Conta Poupança";
    }
}
