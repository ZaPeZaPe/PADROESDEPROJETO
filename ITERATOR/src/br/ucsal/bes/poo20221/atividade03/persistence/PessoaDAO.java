package br.ucsal.bes.poo20221.atividade03.persistence;

import java.util.ArrayList;
import java.util.List;
import br.ucsal.bes.poo20221.atividade03.domain.Pessoa;

public class PessoaDAO {
	
	private static List<Pessoa> pessoas = new ArrayList<>();
	
	public static void persistir(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public static void obter(){
    Iterator<Pessoa> iterator = new PessoaIterator();
    while (iterator.hasNext()) {
        Pessoa pessoa = iterator.next();
        System.out.print(pessoa);
    }
}

	private static class PessoaIterator implements Iterator<Pessoa> {
		private int currentIndex = 0;

		@Override
		public boolean hasNext() {
			return currentIndex < pessoas.size();
		}

		@Override
		public Pessoa next() {
			Pessoa pessoa = pessoas.get(currentIndex);
			currentIndex++;
			return pessoa;
		}
	}
}
