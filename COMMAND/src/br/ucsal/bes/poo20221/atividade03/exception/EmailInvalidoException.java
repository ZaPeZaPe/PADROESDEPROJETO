package br.ucsal.bes.poo20221.atividade03.exception;

public class EmailInvalidoException extends Exception{

    private static final long serialVersionUID = 1L;

    public EmailInvalidoException(String message) {
        super(message);
    }
}
