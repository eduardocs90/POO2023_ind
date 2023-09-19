package br.com.poo.balanco;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralDouble {

	private Double gastosJaneiro   = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco     = 17000.00;
	private Double gastosAbril     = 20000.00;
	private Double gastosMaio      = 16000.00;
	private Double gastosJunho     = 27000.00;
	private Double gastosJulho     = 24000.00;
	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco + gastosAbril + gastosMaio + gastosMaio + gastosJunho + gastosJulho;
	
	private DecimalFormat df = new DecimalFormat("#,###.00");
	private Logger customLogger = Util.setupLogger();
	
	public double soma() {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O balanço trimestral é de R$ " + df.format(somaTotal));
		return somaTotal;
	}
	
	public double soma(double janeiro) {
		Util.customizer();
		customLogger.log(Level.INFO, () -> "O gasto de janeiro foi de R$ " + df.format(janeiro));
		return janeiro;
	}
	
	public double soma(double janeiro, double fevereiro) {
		Util.customizer();
		Double somaBi = janeiro + fevereiro;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro bimestre foi de R$ " + df.format(somaBi));
		return somaBi;
	}
	
	public double soma(double janeiro, double fevereiro, double marco) {
		Util.customizer();
		Double somaTri = janeiro + fevereiro + marco;
		customLogger.log(Level.INFO, () -> "O gasto do primeiro trimestre foi de R$ " + df.format(somaTri));
		return somaTri;
	}
	
	//constrtores
	public BalancoTrimestralDouble(){
		
	}
	public BalancoTrimestralDouble(Double gastosJaneiro){
		this.gastosJaneiro = gastosJaneiro;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double gastosAbril){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double gastosAbril, Double gastosMaio){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
		this.gastosMaio = gastosMaio;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double gastosAbril, Double gastosMaio, Double gastosJunho){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
		this.gastosMaio = gastosMaio;
		this.gastosJunho = gastosJunho;
	}
	public BalancoTrimestralDouble(Double gastosJaneiro, Double gastosFevereiro, Double gastosMarco, Double gastosAbril, Double gastosMaio, Double gastosJunho, Double gastosJulho){
		this.gastosJaneiro = gastosJaneiro;
		this.gastosFevereiro = gastosFevereiro;
		this.gastosMarco = gastosMarco;
		this.gastosAbril = gastosAbril;
		this.gastosMaio = gastosMaio;
		this.gastosJunho = gastosJunho;
		this.gastosJulho = gastosJulho;
	}

	@Override
	public String toString() {
		return "BalancoTrimestralDouble [gastosJaneiro=" + gastosJaneiro + ", gastosFevereiro=" + gastosFevereiro
				+ ", gastosMarco=" + gastosMarco + ", gastosAbril=" + gastosAbril + ", gastosMaio=" + gastosMaio
				+ ", gastosJunho=" + gastosJunho + ", gastosJulho=" + gastosJulho + ", somaTotal=" + somaTotal + ", df="
				+ df + ", customLogger=" + customLogger + "]";
	}
	
}
