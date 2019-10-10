package com.company;

public class Motorista extends Funcionario {

    public Motorista() {
    }

    public Motorista(int numero, String nome) {
        super(numero, nome);
//        System.out.println("Construtor motorista");
    }

    void dirige(){
        System.out.println("Motorista que dirige!");
    }

    @Override
    void trabalha(){
        System.out.println("Motorista que trabalha!");
    }

    @Override
    public int getBonificacao() {
        return 60;
    }
}
