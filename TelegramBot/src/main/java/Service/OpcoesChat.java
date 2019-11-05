package Service;

public enum OpcoesChat {

    OI(1), OLA(2), OLÁ(3), BEM(2), TCHAU(3), ONDE(4), PAIS(5), IDADE(6), ANOS(7), PROFISSAO(8), FAZ(9), RICO(10), DINHEIRO(11), VIAGEM(12), VIAJAR(13), LEGAL(14), BOM(15), SONO(15), AÍ(16), SORTE(17), DORMIR(18), CERTEZA(19), SIM(20), NAO(21), RIR(22), PIADA(23), OUTRA(24);

    private final int valor;

    OpcoesChat(int valor){
        this.valor = valor;
    }
}
