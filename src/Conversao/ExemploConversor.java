package Conversao;

import java.util.Scanner;

public class ExemploConversor {
    public static void main(String[] args) {
        ConversorMetroParaCentimetro cm = new ConversorMetroParaCentimetro();
        ConversorMetroParaMilha milha = new ConversorMetroParaMilha();
        ConversorMetroParaPes pes = new ConversorMetroParaPes();
        ConversorMetroParaQuilometro km = new ConversorMetroParaQuilometro();
        Scanner scan = new Scanner(System.in);
  
        System.out.println("Selecione para qual unidade de medida você quer transformar: ");
        System.out.println("1-Centímetro");
        System.out.println("2-Milhas");
        System.out.println("3-Pes");
        System.out.println("4-Quilometros");
        int tipo = scan.nextInt();
        switch(tipo){
            case 1:
            System.out.println("Qual o valor a ser convertido para centimetros?");
            System.out.println("Valor convertido: " + cm.converte(scan.nextDouble()));
            case 2:
            System.out.println("Qual o valor a ser convertido para milhas?");
            System.out.println("Valor convertido: " + milha.converte(scan.nextDouble()));
            case 3:
            System.out.println("Qual o valor a ser convertido para Pés?");
            System.out.println("Valor convertido: " + pes.converte(scan.nextDouble()));
            case 4:
            System.out.println("Qual o valor a ser convertido para Quilometros?");
            System.out.println("Valor convertido: " + km.converte(scan.nextDouble()));
            case 5:
            System.out.println("Valor não aceito");

        }
        scan.close();
        
    }
}
