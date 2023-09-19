package br.com.poo.Individual;

import java.util.HashMap;
import java.util.Map;


public class Funcionario {
	
	private int id;
	private String nome;
	private String cargo;
	private double salario;
	private String dataContratacao;
	
	public static Map<String, Funcionario> mapaFuncionario = new HashMap<>();
	
	
	
	public Funcionario() {
		
	}


	public Funcionario(int id, String nome, String cargo, double salario, String dataContratacao) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.dataContratacao = dataContratacao;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getDataContratacao() {
		return dataContratacao;
	}


	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cargo=" + cargo + ", salario=" + salario
				+ ", dataContratacao=" + dataContratacao + "]";
	}
	
	
	
	
}
