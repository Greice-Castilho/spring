package br.gov.sp.fatec.projetospringestudo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TrabalhoNaoEncontradoException extends IllegalArgumentException {
    public TrabalhoNaoEncontradoException() {
        super();
    }

    public TrabalhoNaoEncontradoException(String message) {
        super(message);
    }
}
