package br.com.poo.Individual;

import java.util.HashMap;
import java.util.Map;

public class Departamento {
	
	private int idDp;
	private String nomeDP;
	private String chefeDP;
	private int contato;
	
	public static Map<String, Departamento> mapaDepartamento = new HashMap<>();
	
	
	public Departamento() {
			
	}
	
	public Departamento(int idDp, String nomeDP, String chefeDP, int contato) {
		this.idDp = idDp;
		this.nomeDP = nomeDP;
		this.chefeDP = chefeDP;
		this.contato = contato;
		
	}
	public int getIdDp() {
		return idDp;
	}
	
	public String getNomeDP() {
		return nomeDP;
	}
	
	public String getChefeDP() {
		return chefeDP;
	}
	
	public int getContato() {
		return contato;
		
	}
	@Override
	public String toString() {
		return "Departamento [idDp=" + idDp + ", nomeDP=" + nomeDP + ", chefeDP=" + chefeDP + ", contato=" + contato
				+ "]";
	}
	
	
	

}
