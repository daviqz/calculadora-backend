package br.com.calculadora.domain;

import java.util.Arrays;
import java.util.List;

public class Multiplicacao {
	
	private List<Long> fatores;
	private Long resultado;
	
	public Multiplicacao(List<Long> fatores) {
		this.fatores = fatores;
	}
	
	public Multiplicacao(Long fator, Long outroFator) {
		this.fatores = Arrays.asList(fator, outroFator);
	}

	public List<Long> getFatores() {
		return fatores;
	}

	public void setFatores(List<Long> fatores) {
		this.fatores = fatores;
	}
	
	public Long multiplicar() {
		this.fatores.stream().forEach(numero -> this.resultado *= numero);
		return this.resultado;
	}
	
}
