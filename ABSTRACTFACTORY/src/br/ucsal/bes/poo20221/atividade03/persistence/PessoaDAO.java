package br.ucsal.bes.poo20221.atividade03.persistence;

import java.util.ArrayList;
import java.util.List;
import br.ucsal.bes.poo20221.atividade03.domain.Pessoa;

public class PessoaDAO {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public static void persistir(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public static List<Pessoa> obter(){
		return new ArrayList<>(pessoas);
	}
}
