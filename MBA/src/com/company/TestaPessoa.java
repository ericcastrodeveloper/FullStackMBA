package com.company;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Eric");

        Pessoa pessoa2 = new Pessoa("Eric 2", 24);

        System.out.println(Pessoa.getIdentificador());

    }
}
