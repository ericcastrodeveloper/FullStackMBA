package com.company;

public class Processador {

    public static String marca;
    String modelo;
    String velocidade;

    void imprimir(){
        System.out.println("marca "+" - "+marca+ " modelo"+" - "+modelo);
    }

    static void trocaMarca(){
        if(marca.equals("AMD"))
            marca = "Intel";
        else
            marca = "AMD";
    }
}
