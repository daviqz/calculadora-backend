package br.com.calculadora.dto;

public class OperacaoDTO {
	private String primeiroNumero;
	private String operacao;
	private String segundoNumero;
	
	public String getPrimeiroNumero() {
		return primeiroNumero;
	}
	public void setPrimeiroNumero(String primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public String getSegundoNumero() {
		return segundoNumero;
	}
	public void setSegundoNumero(String segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public OperacaoDTO(String primeiroNumero, String operacao, String segundoNumero) {
		this.primeiroNumero = primeiroNumero;
		this.operacao = operacao;
		this.segundoNumero = segundoNumero;
	}
	
	public String operar() {
		Long resultado = 11L;
		Long numeroPrimeiro = Long.parseLong(primeiroNumero);
		Long numeroSegundo = Long.parseLong(segundoNumero);
		String aqui = operacao;
		
		if(aqui.equals("+")) {
			resultado = numeroPrimeiro+numeroSegundo;
		}
		else if (aqui.equals("*")) {
			resultado = numeroPrimeiro*numeroSegundo;
		}
		else if (aqui.equals("/")) {
			resultado = numeroPrimeiro/numeroSegundo;
		}
		else {
			return "Não foi possível realizar a operação";
		}
		
		
		return String.valueOf(resultado);
	}
}
