package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInt {

	private Integer gastosJaneiro = 15000;
	private Integer gastosFevereiro = 23000;
	private Integer gastosMarco = 17000;
	private Integer gastosAbril = 20000;
	private Integer gastosMaio = 16000;
	private Integer gastosJunho = 27000;
	private Integer gastosJulho = 24000;
	
	
	private Integer somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosMaio + gastosJunho + gastosJulho;
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();

	public int soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public int soma(int janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public int soma(int janeiro, int fevereiro) {
		Util.customizer();
		int somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public int soma(int janeiro, int fevereiro, int marco) {
		Util.customizer();
		int somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	public int soma(int janeiro, int fevereiro, int marco, int abril) {
		Util.customizer();
		int somaFor = janeiro + fevereiro + marco + abril;
		customLogger.log(Level.INFO, () -> "O gasto dos quatro mesês foi de R$ " + df.format(somaFor));
		return somaFor;
	}
	public int soma(int janeiro, int fevereiro, int marco, int abril, int maio) {
		Util.customizer();
		int somaFive = janeiro + fevereiro + marco + abril + maio ;
		customLogger.log(Level.INFO, () -> "O gasto dos cinco mêses foi de R$ " + df.format(somaFive));
		return somaFive;
	}
	public int soma(int janeiro, int fevereiro, int marco, int abril, int maio, int junho) {
		Util.customizer();
		int somaSix = janeiro + fevereiro + marco + abril + maio + junho;
		customLogger.log(Level.INFO, () -> "O gasto dos seis mêses foi de R$ " + df.format(somaSix));
		return somaSix;
	}
	public int soma(int janeiro, int fevereiro, int marco, int abril, int maio, int junho, int julho) {
		Util.customizer();
		int somaSeven = janeiro + fevereiro + marco + abril + maio + junho + julho;
		customLogger.log(Level.INFO, () -> "O gasto dos sete mêses foi de R$ " + df.format(somaSeven));
		return somaSeven;
	}
}
