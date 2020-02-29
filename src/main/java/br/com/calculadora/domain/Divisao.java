package br.com.calculadora.domain;

public class Divisao {
	
	private Long divisor;
	private Long dividendo;
	
	public Divisao(Long divisor, Long dividendo) {
		this.divisor = divisor;
		this.dividendo = dividendo;
	}


	public Long getDivisor() {
		return divisor;
	}


	public void setDivisor(Long divisor) {
		this.divisor = divisor;
	}


	public Long getDividendo() {
		return dividendo;
	}


	public void setDividendo(Long segundoNumero) {
		this.dividendo = segundoNumero;
	}

	public Long dividir() {
		Long resultado = this.divisor/this.dividendo;
		return resultado;
	}
}
