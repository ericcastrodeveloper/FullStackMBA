package com.company;

public class Controles {

    public static void main(String[] args) {
        int x = 0;

        while(x <= 10){
            System.out.println(x);
            x++;
        }

        if(x == 0){
            System.out.println("x é igual a "+ x);
        }else
            System.out.println("x é diferente de 0");

        System.out.println("Switch-Case");

        switch (x){
            case 0:
                System.out.println("x é igual a zero");
                break;

            default:
                System.out.println("x é diferente de zero " + x);
        }
    }
}
