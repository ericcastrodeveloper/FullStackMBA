package com.company;

public class Diretor extends Funcionario implements Autenticavel {

    private String senha = "123";

    @Override
    public int getBonificacao() {
        return 0;
    }

    @Override
    public boolean autentica(String senha) {
        if(senha.equals(this.senha)){
            return true;
        }else
            return false;
    }


}
