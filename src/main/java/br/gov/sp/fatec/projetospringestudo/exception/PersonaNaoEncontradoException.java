package br.gov.sp.fatec.projetospringestudo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PersonaNaoEncontradoException extends IllegalArgumentException {
    public PersonaNaoEncontradoException() {
        super();
    }

    public PersonaNaoEncontradoException(String message) {
        super(message);
    }
}
