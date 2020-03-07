package br.com.calculadora.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.calculadora.dto.OperacaoDTO;
import br.com.calculadora.dto.ResultadoDTO;
import br.com.calculadora.service.OperacaoService;
import br.com.calculadora.service.ResultadoService;

@Service
public class ResultadoServiceImpl implements ResultadoService{

	@Autowired
	OperacaoService operacaoService;
	
	@Override
	public ResultadoDTO resultado(OperacaoDTO operacao) {
		return new ResultadoDTO().text(operacaoService.operacao(operacao));
	}
}
