//Atena
package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double t, n, y;
        char opc;

        System.out.println("Seja bem-vindo(a) ao programa Atena!\nAqui iremos converter temperaturas de °C para °F e de °F para °C\n");
        System.out.print("Escolha a opção que você quer usar: ( f ) para °F ou ( c ) para °C: ");
        
        Scanner scanner = new Scanner(System.in);
        opc = scanner.next().charAt(0);

        System.out.print("Digite a temperatura: ");
        t = scanner.nextDouble();

        n = t * 1.8 + 32;
        y = (t - 32) * 5 / 9;

        switch (opc) {
            case 'f':
                System.out.println("Essa é a temperatura em °F: " + n);
                break;
            case 'c':
                System.out.println("Essa é a temperatura em °C é: " + y);
                break;
            default:
                System.out.println("Opção inválida");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        scanner.close();
    }
}



