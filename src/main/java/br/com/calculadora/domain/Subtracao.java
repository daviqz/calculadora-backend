package br.com.calculadora.domain;

public class Subtracao {

	private Long primeiroNumero;
	private Long segundoNumero;
	
	public Long getPrimeiroNumero() {
		return primeiroNumero;
	}
	public void setPrimeiroNumero(Long primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public Long getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(Long segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public Subtracao(Long primeiroNumero, Long segundoNumero) {
		super();
		this.primeiroNumero = primeiroNumero;
		this.segundoNumero = segundoNumero;
	}
	public Long subtrair() {
		Long resultado = this.primeiroNumero - this.segundoNumero;
		return resultado;
	}
}
