package br.com.poo.ExerciciosAula;

//ferpackage br.com.poo.lista1;

import java.util.Scanner;

//programa do portugol
public class ExercicioAula1 {
	
	//função inicio do portugol
	//função no portugol agora -> metodo no java
	
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner (System.in); //biblioteca
		
		//funçao escreva do portugol:
		
		System.out.println("por favor , informe seu nome: ");
		nome = sc.nextLine ();// faz leitura de string
		
		//utilização do laço for pra limpar a tela
		for (int i=0; i<20;i++) {
			System.out.println("\n");
		}
		System.out.println("agora informe seu sobre nome: ");
		sobrenome =sc.next();
		sc.close(); // fecha o Scanner(biblioteca)
		
		
		System.out.println("Seja bem-vindos " + nome + " "+ sobrenome);
		}
		public static void limpa() {
			for (int i=0; i<8;i++) {
				System.out.println();			
		}
		}

}
//botão direto do mause encima do arquivo -> run as-> java aplication ( para executar o code)


