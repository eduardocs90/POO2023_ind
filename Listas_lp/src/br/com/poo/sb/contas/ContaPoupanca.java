package br.com.poo.sb.contas;

public class ContaPoupanca extends Conta {

	private double rendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String tipoConta, String numConta, String cpf, Double saldo) {
		super(tipoConta, numConta, cpf, saldo);
	}

	public double getRendimento() {
		return rendimento;
	}
	//
}
