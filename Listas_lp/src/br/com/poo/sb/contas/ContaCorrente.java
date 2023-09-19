package br.com.poo.sb.contas;

public class ContaCorrente extends Conta {

	private double chequeEspecial;
	//private boolean chequeEspecial;

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String tipoConta, String numConta, String cpf, Double saldo, Double chequeEspecial) {
		super(tipoConta, numConta, cpf, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	//
}
