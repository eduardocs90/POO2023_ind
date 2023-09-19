package br.com.poo.sb.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.contas.ContaPoupanca;

public class LeituraEscrita {

	static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";

		while (true) {
			linha = buffRead.readLine();
			if (linha != null) {
				String[] dados = linha.split(";");
				
				if(dados[0].equalsIgnoreCase("POUPANCA")) {
					//Poupanca String tipoConta, String numConta, String cpf, Double saldo
					ContaPoupanca cp = new ContaPoupanca(dados[0],
							dados[1], dados[2], Double.parseDouble(dados[3]));
					Conta.mapaContas.put(dados[2], cp);
					System.out.println(cp);
				} else if(dados[0].equalsIgnoreCase("CORRENTE")) {
					//Corrente String tipoConta, String numConta, String cpf, double saldo, double chequeEspecial
					
				} else if(dados[0].equalsIgnoreCase("CLIENTE")) {
					
				} else if(dados[0].equalsIgnoreCase("GERENTE")) {
					
				} else if(dados[0].equalsIgnoreCase("DIRETOR")) {
					
				} else if(dados[0].equalsIgnoreCase("PRESIDENTE")) {
					
				}
			} else {
				break;
			}
		}
		buffRead.close();
	}

	public static void escritor(String path) throws IOException {
		String teste;
		Scanner sc = new Scanner(System.in);

		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(PATH_BASICO + path + EXTENSAO, true));

		System.out.println("Escreva algo: ");
		teste = sc.nextLine();
		buffWriter.append(teste + "\n");
		sc.close();
		buffWriter.close();
	}

//	public static void leitor(String path) {
//		try {
//			BufferedReader buffRead = new BufferedReader(
//					new FileReader(PATH_BASICO+path+EXTENSAO));
//			String linha = "";
//			while(true) {
//				linha = buffRead.readLine();
//				if(linha != null) {
//					System.out.println(linha);
//				} else {
//					break;
//				}
//			}
//			buffRead.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
