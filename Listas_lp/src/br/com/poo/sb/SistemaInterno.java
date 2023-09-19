package br.com.poo.sb;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;

import br.com.poo.sb.contas.Conta;
import br.com.poo.sb.io.LeituraEscrita;
import br.com.poo.sb.pessoas.Funcionario;
import br.com.poo.sb.pessoas.Gerente;
import br.com.poo.util.Util;

public class SistemaInterno {

	public static void main(String[] args) throws IOException {
		LeituraEscrita.leitor("banco");
		//LeituraEscrita.escritor("banco");
		
		DecimalFormat df = new DecimalFormat("#0,000.00");
		Conta c1 = new Conta("Corrente", "123456-7", "132.456.789-11", 10000.20);
		
		//Conta c2 = new ContaCorrente();
		//ContaCorrente c3 = new ContaCorrente();
		Funcionario f1 = new Gerente();
		
		c1.getCpf();
		c1.getSaldo();

		Util.customizer();
		Util.setupLogger().log(Level.INFO, () -> "Titular: " + c1.getCpf() + " Saldo: " + df.format(c1.getSaldo())
				+ " Número: " + c1.getNumConta());
	}

}
