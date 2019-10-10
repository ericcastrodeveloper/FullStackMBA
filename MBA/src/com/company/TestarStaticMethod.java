package com.company;

public class TestarStaticMethod {

    public static void main(String[] args) {

        Processador p = new Processador();
        p.marca = "Intel";
        System.out.println(p.marca);
        Processador.trocaMarca();
        System.out.println(p.marca);
    }
}
