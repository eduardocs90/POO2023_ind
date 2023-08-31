package br.com.poo.ExerciciosAula;

/*•1) Declare duas variáveis do tipo int e realize sua soma. Em
seguida, realize o casting destes dois inteiros para double para
realizar sua divisão.*/

import java.util.Scanner;

public class ExercicoAula3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int soma;
		
		System.out.println("Digite um numero; ");
		n1 = sc.nextInt();
		System.out.println("Digite um outro numero; ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("A soma é: "+ soma);
		double result = (double)n1/(double)n2;
		System.out.println("E a divisão com castings é;" + result );
		sc.close();
	}

}




















