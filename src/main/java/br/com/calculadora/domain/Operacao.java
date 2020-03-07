package br.com.calculadora.domain;

import br.com.calculadora.dto.OperacaoDTO;

public class Operacao {
	
	private String primeiroNumero;
	private String tipoOperacao;
	private String segundoNumero;
	private String resultado;
	
	public String getPrimeiroNumero() {
		return primeiroNumero;
	}
	public void setPrimeiroNumero(String primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public String getTipoOperacao() {
		return tipoOperacao;
	}
	public void setTipoOperacao(String operacao) {
		this.tipoOperacao = operacao;
	}
	public String getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(String segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public Operacao(String primeiroNumero, String operacao, String segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.tipoOperacao = operacao;
		this.segundoNumero = segundoNumero;
	}
	
	public Operacao(OperacaoDTO operacaoDTO) {
		this.primeiroNumero = operacaoDTO.getPrimeiroNumero();
		this.tipoOperacao = operacaoDTO.getOperacao();
		this.segundoNumero = operacaoDTO.getSegundoNumero();
	}
}
