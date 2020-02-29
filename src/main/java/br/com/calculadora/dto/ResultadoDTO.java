package br.com.calculadora.dto;

import java.io.Serializable;

public class ResultadoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String text;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public ResultadoDTO text(final String text) {
        this.text = text;
        return this;
    }

    @Override
    public String toString() {
        return "ResultadoDTO{" +
               "text='" + text + '\'' +
               '}';
    }
}
