package br.ucsal.bes.poo20221.atividade03.exception;

public class NomeVazioException extends Exception{

    private static final long serialVersionUID = 1L;

    public NomeVazioException(String message) {
        super(message);
    }
}

