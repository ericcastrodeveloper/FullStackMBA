package com.company;

public interface Autenticavel {
    boolean autentica(String senha);

    default int coisa(int a){
        return a;
    }
}
