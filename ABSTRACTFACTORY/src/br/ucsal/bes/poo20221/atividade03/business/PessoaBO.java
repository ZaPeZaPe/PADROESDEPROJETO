package br.ucsal.bes.poo20221.atividade03.business;

import br.ucsal.bes.poo20221.atividade03.domain.Pessoa;
import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class PessoaBO {
	
	public static void cadastrarPessoa(Pessoa pessoa) {
		PessoaDAO.persistir(pessoa);
	}

}
