package com.calculadora.facade;
import java.util.Scanner;


public class ExemploCalculadora {
    public static void main(String[] args) {
      CalculadoraFacade facade = new CalculadoraFacade();
      Scanner scan = new Scanner(System.in);

      System.out.println("Digite o Primeiro Número");
      double primeiroNumero = scan.nextDouble();
      System.out.println("Digite o Segundo Número");
      double segundoNumero = scan.nextDouble();
      scan.close();
      
      System.out.println("\nResultados Obtidos: ");

      facade.run(primeiroNumero, segundoNumero);
    }
}
