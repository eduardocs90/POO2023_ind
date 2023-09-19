package br.com.poo.Individual.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.poo.Individual.Departamento;
import br.com.poo.Individual.Funcionario;

public class LeituraEscrita {

	private static final String PATH_BASICO = "./temp/";
	private static final String EXTENSAO = ".txt";
	private static Map<String, Departamento> mapaDepartamentos = new HashMap<>();
	private static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	private static BufferedWriter buffWriterFuncionarios;
	private static BufferedWriter buffWriterDepartamentos;

	static {
		try {
			buffWriterFuncionarios = new BufferedWriter(
					new FileWriter(PATH_BASICO + "relatorio_funcionarios.txt", true));
			buffWriterDepartamentos = new BufferedWriter(
					new FileWriter(PATH_BASICO + "relatorio_departamentos.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));

		String linha = "";
		while ((linha = buffRead.readLine()) != null) {
			String[] dados = linha.split(";");
			if (dados.length == 4) {
				Departamento departamento = new Departamento(Integer.parseInt(dados[0]), dados[1], dados[2],
						Integer.parseInt(dados[3]));
				mapaDepartamentos.put(departamento.getNomeDP(), departamento);
			} else if (dados.length == 5) {
				Funcionario funcionario = new Funcionario(Integer.parseInt(dados[0]), dados[1], dados[2],
						Double.parseDouble(dados[3]), dados[4]);
				mapaFuncionarios.put(funcionario.getNome(), funcionario);
			}
		}
		buffRead.close();
	}

	public static void exibirRelatorioImpresso(Departamento departamento) throws IOException {
		if (departamento == null) {
			System.out.println("Departamento não encontrado.");
			return;
		}

		buffWriterDepartamentos.write("------------------ Relatório do Departamentos ------------------\n");
		buffWriterDepartamentos.write("Nome do Departamento: " + departamento.getNomeDP() + "\n");
		buffWriterDepartamentos.write("Chefe: " + departamento.getChefeDP() + "\n");
		buffWriterDepartamentos.write("Contato: " + departamento.getContato() + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriterDepartamentos.write("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriterDepartamentos.write("------------------ FIM DO COMPROVANTE ------------------\n");
		buffWriterDepartamentos.flush();
	}

	public static void exibirRelatorioImpresso(Funcionario funcionario) throws IOException {
		if (funcionario == null) {
			System.out.println("Funcionário não encontrado.");
			return;
		}

		buffWriterFuncionarios.write("------------------ Relatório do Funcionarios ------------------\n");
		buffWriterFuncionarios.write("Nome: " + funcionario.getNome() + "\n");
		buffWriterFuncionarios.write("Cargo: " + funcionario.getCargo() + "\n");
		buffWriterFuncionarios.write("Salário atual: " + funcionario.getSalario() + "\n");
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		buffWriterFuncionarios.write("Operação realizada em: " + dtf.format(dataHora) + "\n");
		buffWriterFuncionarios.write("------------------ FIM DO COMPROVANTE ------------------\n");
		buffWriterFuncionarios.flush();
	}

	public static void iniciar() {
		try {
			leitor("ind");
			exibirMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void exibirRelatorioTela(Funcionario f) {
		if (f == null) {
			System.out.println("Funcionário não encontrado.");
			return;
		}

		System.out.println("\n==== Relatório do Funcionario ====");
		System.out.println("Nome: " + f.getNome());
		System.out.println("Cargo: " + f.getCargo());
		System.out.println("Salário atual: " + f.getSalario());
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Operação realizada em: " + dtf.format(dataHora));
		System.out.println("==== FIM DO COMPROVANTE ====");
	}

	public static void exibirRelatorioTela(Departamento departamento) {
		if (departamento == null) {
			System.out.println("Departamento não encontrado.");
			return;
		}

		System.out.println("\n==== Relatório do Departamento ====");
		System.out.println("Nome do Departamento: " + departamento.getNomeDP());
		System.out.println("Chefe: " + departamento.getChefeDP());
		System.out.println("Contato: " + departamento.getContato());
		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Operação realizada em: " + dtf.format(dataHora));
		System.out.println("==== FIM DO COMPROVANTE ====");
	}

	public static void exibirMenu() {
		try (Scanner scanner = new Scanner(System.in)) {
			int opc;

			do {
				System.out.println("\n==== Menu ====");
				System.out.println("1. Relatório na tela");
				System.out.println("2. Relatório impresso");
				System.out.println("3. Sair");
				System.out.print("Escolha uma opção: ");
				opc = scanner.nextInt();
				scanner.nextLine(); // Limpa o buffer do teclado

				switch (opc) {
				case 1:
					System.out.println("\n==== Tipos de Relatório na Tela ====");
					System.out.println("1. Funcionário");
					System.out.println("2. Departamento");
					System.out.print("Escolha uma opção: ");
					int tipoRelatorioTela = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do teclado

					switch (tipoRelatorioTela) {
					case 1:
						// Listar funcionários
						for (Funcionario funcionario : mapaFuncionarios.values()) {
							exibirRelatorioTela(funcionario);
						}
						break;
					case 2:
						// Listar departamentos
						for (Departamento departamento : mapaDepartamentos.values()) {
							exibirRelatorioTela(departamento);
						}
						break;
					default:
						System.out.println("Opção inválida.");
						break;
					}
					break;
				case 2:
					System.out.println("\n==== Tipos de Relatório Impresso ====");
					System.out.println("1. Funcionário");
					System.out.println("2. Departamento");
					System.out.print("Escolha uma opção: ");
					int tipoRelatorioImpresso = scanner.nextInt();
					scanner.nextLine(); // Limpa o buffer do teclado

					switch (tipoRelatorioImpresso) {
					case 1:
						// Listar funcionários e salvar em arquivo
						for (Funcionario funcionario : mapaFuncionarios.values()) {
							try {
								exibirRelatorioImpresso(funcionario);
								System.out.println("Relatório de " + funcionario.getNome() + " impresso com sucesso.");
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						break;
					case 2:
						// Listar departamentos e salvar em arquivo
						for (Departamento departamento : mapaDepartamentos.values()) {
							try {
								exibirRelatorioImpresso(departamento);
								System.out
										.println("Relatório de " + departamento.getNomeDP() + " impresso com sucesso.");
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						break;
					default:
						System.out.println("Opção inválida.");
						break;
					}
					break;
				case 3:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida.");
					break;
				}
			} while (opc != 3);
			buffWriterFuncionarios.close();
			buffWriterDepartamentos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}