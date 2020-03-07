package br.com.calculadora.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculadora.dto.OperacaoDTO;
import br.com.calculadora.dto.ResultadoDTO;
import br.com.calculadora.service.ResultadoService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class OperacaoResource {
	
	@Autowired
	private ResultadoService service;
    
	@PostMapping("/operacao")
    public ResponseEntity<ResultadoDTO> operacao(@RequestBody OperacaoDTO operacaoDTO) {
    	return ResponseEntity.ok(service.resultado(operacaoDTO));
    }
}
