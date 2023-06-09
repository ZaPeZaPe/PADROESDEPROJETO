package br.ucsal.bes.poo20221.atividade03.business;

import br.ucsal.bes.poo20221.atividade03.domain.Alunos;
import br.ucsal.bes.poo20221.atividade03.domain.Professores;
import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class PessoaBO {
	
	public static void cadastrarAluno(Alunos aluno) {
		PessoaDAO.persistir(aluno);
	}
	
	public static void cadastrarProfessor(Professores professor) {
		PessoaDAO.persistir(professor);
	}
}
