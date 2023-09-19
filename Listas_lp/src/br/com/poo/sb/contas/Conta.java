package br.com.poo.sb.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import br.com.poo.util.Util;

public class Conta {

	private String tipoConta;
	private String numConta;
	private String cpf;
	private Double saldo;

	public static Map<String, Conta> mapaContas = new HashMap<>();
	
	public Conta() {
	}

	public Conta(String tipoConta, String numConta, String cpf, Double saldo) {
		this.tipoConta = tipoConta;
		this.numConta = numConta;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public boolean sacar(Double valor) {
		if (this.saldo < valor) {
			return false;
		} else if(valor <= 0.0) {
			Util.customizer();
			Util.setupLogger().log(Level.INFO, () -> "Valor inválido!");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	public String getNumConta() {
		return numConta;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", cpf=" + cpf + ", saldo=" + saldo + "]\n";
	}

}
