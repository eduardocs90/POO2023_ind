//HERA
package br.com.poo.lista1; 


	import java.util.Scanner;
	public class Exercicio2 {
		
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] idade = new int[5];
        int soma = 0;
        int minhaIdade;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Qual é a idade do colega " + (i + 1) + "? ");
            idade[i] = sc.nextInt();
        }
        
        System.out.print("Qual é a minha idade? ");
        minhaIdade = sc.nextInt();
        
        for (int i = 0; i < 5; i++) {
            soma = soma + idade[i];
        }
        
        System.out.println("O tempo de vida meu e dos meus colegas é " + (soma + minhaIdade));
        
        sc.close();
    }
}
