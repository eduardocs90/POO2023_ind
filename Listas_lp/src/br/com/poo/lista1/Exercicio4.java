//ZEUS
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        double n1, n2;

        System.out.print("Vamos calcular! Digite um número: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite um segundo número: ");
        n2 = scanner.nextDouble();
        System.out.println("Qual operação deseja fazer:\nDigite (1) para somar, (2) para subtrair, (3) para multiplicar, (4) para dividir: ");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("O resultado da Soma é: " + (n1 + n2));
                break;
            case 2:
                System.out.println("O resultado da subtração é: " + (n1 - n2));
                break;
            case 3:
                if (n1 != 0 && n2 != 0) {
                    System.out.println("O resultado da multiplicação é: " + (n1 * n2));
                } else {
                    System.out.println("\nEssa operação não pode ser realizada...");
                }
                break;
            case 4:
                if (n1 != 0 && n2 != 0) {
                    System.out.println("O resultado da divisão é: " + (n1 / n2));
                } else {
                    System.out.println("\nEssa operação não pode ser realizada...");
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}

