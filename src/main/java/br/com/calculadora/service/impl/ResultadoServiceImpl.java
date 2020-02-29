package br.com.calculadora.service.impl;

import org.springframework.stereotype.Service;

import br.com.calculadora.dto.OperacaoDTO;
import br.com.calculadora.dto.ResultadoDTO;
import br.com.calculadora.service.ResultadoService;

@Service
public class ResultadoServiceImpl implements ResultadoService{

	@Override
	public ResultadoDTO operacao(OperacaoDTO operacao) {
		return new ResultadoDTO().text(operacao.operar());
	}
}
