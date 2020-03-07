package br.com.calculadora.service;

import br.com.calculadora.dto.OperacaoDTO;
import br.com.calculadora.dto.ResultadoDTO;

public interface ResultadoService {

	ResultadoDTO resultado(OperacaoDTO operacaoDTO);
}
