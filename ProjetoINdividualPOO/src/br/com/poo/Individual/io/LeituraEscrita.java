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
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.Individual.Departamento;
import br.com.poo.Individual.Funcionario;
import br.com.poo.util.Util;

public class LeituraEscrita {

	private static final String PATH_BASICO = "./temp/";
	private static final String EXTENSAO = ".txt";
	private static Map<String, Departamento> mapaDepartamentos = new HashMap<>();
	private static Map<String, Funcionario> mapaFuncionarios = new HashMap<>();
	private static BufferedWriter buffWriterFuncionarios;
	private static BufferedWriter buffWriterDepartamentos;
	public static final Logger customLogger = Util.setupLogger();
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
	        	 customLogger.log(Level.INFO,() ->"Funcionário não encontrado.");
	            return;
	        }
	        
	        customLogger.log(Level.INFO,() ->"\n==== Relatório do Funcionario ====");
	        customLogger.log(Level.INFO,() ->"Nome: " + f.getNome());
	        customLogger.log(Level.INFO,() ->"Cargo: " + f.getCargo());
	        customLogger.log(Level.INFO,() ->"Salário atual: " + f.getSalario());
	        LocalDateTime dataHora = LocalDateTime.now();
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        customLogger.log(Level.INFO,() ->"Operação realizada em: " + dtf.format(dataHora));
	        customLogger.log(Level.INFO,() ->"==== FIM DO COMPROVANTE ====");
	    }

	    public static void exibirRelatorioTela(Departamento departamento) {
	        if (departamento == null) {
	        	 customLogger.log(Level.INFO,() ->"Departamento não encontrado.");
	            return;
	        }

	        customLogger.log(Level.INFO,() ->"\n==== Relatório do Departamento ====");
	        customLogger.log(Level.INFO,() ->"Nome do Departamento: " + departamento.getNomeDP());
	        customLogger.log(Level.INFO,() ->"Chefe: " + departamento.getChefeDP());
	        customLogger.log(Level.INFO,() ->"Contato: " + departamento.getContato());
	        LocalDateTime dataHora = LocalDateTime.now();
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	        customLogger.log(Level.INFO,() ->"Operação realizada em: " + dtf.format(dataHora));
	        customLogger.log(Level.INFO,() ->"==== FIM DO COMPROVANTE ====");
	    }

	    public static void exibirMenu() {
	        try (Scanner scanner = new Scanner(System.in)) {
	            int opc;

	            do {
	            	 customLogger.log(Level.INFO,() ->"\n==== Menu ====");
	            	 customLogger.log(Level.INFO,() ->"1. Relatório na tela");
	            	 customLogger.log(Level.INFO,() ->"2. Relatório impresso");
	            	 customLogger.log(Level.INFO,() ->"3. Sair");
	            	 customLogger.log(Level.INFO,() ->"Escolha uma opção: ");
	                opc = scanner.nextInt();
	                scanner.nextLine(); 

	                switch (opc) {
	                    case 1:
	                    	 customLogger.log(Level.INFO,() ->"\n==== Tipos de Relatório na Tela ====");
	                    	 customLogger.log(Level.INFO,() ->"1. Funcionário");
	                    	 customLogger.log(Level.INFO,() ->"2. Departamento");
	                    	 customLogger.log(Level.INFO,() ->"Escolha uma opção: ");
	                        int tipoRelatorioTela = scanner.nextInt();
	                        scanner.nextLine(); 

	                        switch (tipoRelatorioTela) {
	                            case 1:
	                                for (Funcionario funcionario : mapaFuncionarios.values()) {
	                                    exibirRelatorioTela(funcionario);
	                                }
	                                break;
	                            case 2:
	                                for (Departamento departamento : mapaDepartamentos.values()) {
	                                    exibirRelatorioTela(departamento);
	                                }
	                                break;
	                            default:
	                            	 customLogger.log(Level.INFO,() ->"Opção inválida.");
	                                break;
	                        }
	                        break;
	                    case 2:
	                    	 customLogger.log(Level.INFO,() ->"\n==== Tipos de Relatório Impresso ====");
	                    	 customLogger.log(Level.INFO,() ->"1. Funcionário");
	                    	 customLogger.log(Level.INFO,() ->"2. Departamento");
	                    	 customLogger.log(Level.INFO,() ->"Escolha uma opção: ");
	                        int tipoRelatorioImpresso = scanner.nextInt();
	                        scanner.nextLine(); 

	                        switch (tipoRelatorioImpresso) {
	                            case 1:
	                                for (Funcionario funcionario : mapaFuncionarios.values()) {
	                                    try {
	                                        exibirRelatorioImpresso(funcionario);
	                                        customLogger.log(Level.INFO,() ->"Relatório de " + funcionario.getNome() + " impresso com sucesso.");
	                                    } catch (IOException e) {
	                                        e.printStackTrace();
	                                    }
	                                }
	                                break;
	                            case 2:
	                                for (Departamento departamento : mapaDepartamentos.values()) {
	                                    try {
	                                        exibirRelatorioImpresso(departamento);
	                                        customLogger.log(Level.INFO,() ->"Relatório de " + departamento.getNomeDP() + " impresso com sucesso.");
	                                    } catch (IOException e) {
	                                        e.printStackTrace();
	                                    }
	                                }
	                                break;
	                            default:
	                            	 customLogger.log(Level.INFO,() ->"Opção inválida.");
	                                break;
	                        }
	                        break;
	                    case 3:
	                    	 customLogger.log(Level.INFO,() ->"Saindo...");
	                        break;
	                    default:
	                    	 customLogger.log(Level.INFO,() ->"Opção inválida.");
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