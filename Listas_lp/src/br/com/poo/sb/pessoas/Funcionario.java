package br.com.poo.sb.pessoas;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
	
	//metodo de bonificacao - Gerente(menor que o do Diretor) e Diretor
	
}
