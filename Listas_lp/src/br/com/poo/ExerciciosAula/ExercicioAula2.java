package br.com.poo.ExerciciosAula;

import java.util.Scanner;

public class ExercicioAula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n; 
		int f;
		int s;
		
		System.out.println("Insira o primeiro numero: ");
		n = sc.nextInt ();
		System.out.println("insira o segundo numero: ");
		f = sc.nextInt ();
		s = n + f;
		System.out.println("A soma dos dois inteiros é: " + s );
		sc.close();
	}

}
