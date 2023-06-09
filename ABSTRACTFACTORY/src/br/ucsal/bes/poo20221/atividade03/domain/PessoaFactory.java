package br.ucsal.bes.poo20221.atividade03.domain;

public class PessoaFactory {
    public static final Integer ALUNO = 1;
    public static final Integer PROFESSOR = 2;

    public static Pessoa get(Integer tipo) {
        return switch(tipo) {
            case 1 -> new Alunos();
            case 2 -> new Professores();
            default -> null;
        };
    }
}
