package io.github;

import java.util.Scanner;

public class Cli_modulo_rep2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tabuada(sc);

        repetidorFrase(sc);
        sc.close();
    }

    static void repetidorFrase(Scanner sc) {
        
        
        String entrada = "";
        System.out.println("=== REPETIDOR DE FRASES ===");
        do {
            System.out.println("Digite 1 para continuar ou 2 para sair");
            entrada = sc.nextLine();
            if (entrada.equals("1")) {
                System.out.println("Escreva uma frase.");
                entrada = sc.nextLine();
                System.out.println("Digitou: "+entrada);
            } else if (entrada.equals("2")) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado");
                break;
            }
        } while (true);
        
    }

    static void tabuada(Scanner sc) {
        
        System.out.println("=== TABUADA ===");
        System.out.println("Digite um númro para saber a tabuada deste de 1 a 10");
        double numero = sc.nextDouble();
        sc.nextLine();
        int i = 1;
        while (i <= 10) {
            double res = i * numero;
            System.out.println("%.2f X %d = %.2f".formatted(numero, i, res));
            i++;
        }
        
    }
}
