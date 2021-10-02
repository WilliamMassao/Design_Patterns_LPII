package com.calculadora.facade;

/* Facade */
public class CalculadoraFacade {
    private Soma soma;
    private Subtracao subtracao;
    private Multiplicacao multiplicacao;
    private Divisao divisao;

    public CalculadoraFacade(){
        this.soma = new Soma();
        this.subtracao = new Subtracao();
        this.multiplicacao = new Multiplicacao();
        this.divisao = new Divisao();
    }

    public void run(double primeiroNumero, double segundoNumero){
        System.out.println("Soma = " + soma.realizaSoma(primeiroNumero, segundoNumero));
        System.out.println("Subtracao = " + subtracao.realizaSubtracao(primeiroNumero, segundoNumero));
        System.out.println("Multiplicacao = " + multiplicacao.realizaMultiplicacao(primeiroNumero, segundoNumero));
        System.out.println("Divisao = " + divisao.realizaDivisao(primeiroNumero, segundoNumero));
    }
}
