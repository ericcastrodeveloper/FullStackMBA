package com.company.conta;

import com.company.conta.ContaCorrente;
import com.company.conta.ContaPoupanca;

public class TesteConta {

    public static void main(String[] args) {

        System.out.println("Conta 1");
        System.out.println();
        ContaCorrente conta1 = new ContaCorrente("Eric", 0, 1);
        conta1.deposita(10000.00);
        conta1.saque(2000.00);
        System.out.println(conta1.getTipo());

        System.out.println("Saldo: "+ conta1.getSaldo());
        System.out.println("Titular: "+ conta1.getTitular());
        System.out.println("Numero: "+ conta1.getNumeroConta());

        System.out.println();

        System.out.println("Conta 2");
        System.out.println();
        ContaPoupanca conta2 = new ContaPoupanca("Danilo", 0, 2);
        conta2.deposita(5000.00);
        conta2.saque(2000.00);
        conta2.getTipo();

        System.out.println(conta2.getTipo());
        System.out.println("Saldo: "+ conta2.getSaldo());
        System.out.println("Titular: "+ conta2.getTitular());
        System.out.println("Numero: "+ conta2.getNumeroConta());


    }
}
