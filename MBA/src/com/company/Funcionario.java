package com.company;

public abstract class Funcionario {

    int numero;
    String nome;

    public Funcionario() {
    }

    public Funcionario(int numero, String nome) {
//        System.out.println("Construtor Funcionario");
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    void trabalha(){
        System.out.println("Funcionario que trabalha!");
    }

    public abstract int getBonificacao();
}
