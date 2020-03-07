package br.com.calculadora.service.impl;

import org.springframework.stereotype.Service;

import br.com.calculadora.domain.Divisao;
import br.com.calculadora.domain.Operacao;
import br.com.calculadora.domain.Subtracao;
import br.com.calculadora.dto.OperacaoDTO;
import br.com.calculadora.service.OperacaoService;

@Service
public class OperacaoServiceImpl implements OperacaoService {

	@Override
	public String operacao(OperacaoDTO operacaoDTO) {
		Operacao operacao = new Operacao(operacaoDTO);
		
		Long resultado = null;
		switch (operacao.getTipoOperacao()) {
			case "/":
				Divisao divisao = new Divisao(Long.parseLong(operacao.getPrimeiroNumero()), Long.parseLong(operacao.getSegundoNumero()));
				resultado = divisao.dividir();
				break;
				
			case "exp":
				
				break;
				
			case "*":
				
				break;
				
			case "raiz":
				
				break;
				
			case "+":
				
				break;
				
			case "-":
				Subtracao subtracao= new Subtracao(Long.parseLong(operacao.getPrimeiroNumero()), Long.parseLong(operacao.getSegundoNumero()));
				resultado = subtracao.subtrair();
				break;
		}
		
		if(resultado == null) {
			return "Nao foi possivel encontrar essa operacao";
		}
		else {
			return String.valueOf(resultado);
		}

	}
}
