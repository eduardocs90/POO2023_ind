package br.com.poo.lista2;

import java.util.Scanner;

import java.util.Calendar;

public class Exercicio2l2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Calendar calendario = Calendar.getInstance();
	int mesNasc;
	int anoNasc = 0;
	int anoAtual;
	System.out.println("Qual é seu mês de nascimento? ");
	mesNasc = sc.nextInt();
	System.out.println("\nQual é seu ano de nascimento? ");
	anoNasc = sc.nextInt();
	mesNasc =   calendario.get(Calendar.MONTH);
	anoAtual =  calendario.get(Calendar.YEAR);
	anoNasc = anoAtual - anoNasc;
		if (mesNasc < 0) {
			anoNasc = anoNasc -1;
			sc.close();
		}
		System.out.println("\n A sua idade é: "+ anoNasc );

	} 
}
