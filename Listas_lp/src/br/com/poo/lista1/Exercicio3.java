//Apolo
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opc;
        int i, n;
        boolean vr = true;
        System.out.println("Seja bem-vindo ao programa Apolo!");
        System.out.println("Aqui iremos calcular expressões...");
        System.out.println("Vamos começar!");
        
        while (vr) {
            System.out.println("Temos duas opções, escolha opção (a) para expressão 1 ou (b) para expressão 2: ");
            opc = sc.next().charAt(0);

            i = 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66;
            n = 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9;

            switch (opc) {
                case 'a':
                    System.out.println("O resultado da expressão é: " + i);
                    break;
                case 'b':
                    System.out.println("O resultado da expressão é: " + n);
                    break;
                default:
                    System.out.println("Opção inválida");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

            System.out.println("Deseja calcular outra expressão? (S/N): ");
            char encerrar = sc.next().charAt(0);
            if (encerrar == 'N' || encerrar == 'n') {
                vr = false;
            }
        }

        sc.close();
    }
}
