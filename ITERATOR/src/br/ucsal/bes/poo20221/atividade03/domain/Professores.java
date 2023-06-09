package br.ucsal.bes.poo20221.atividade03.domain;

import br.ucsal.bes.poo20221.atividade03.exception.EmailInvalidoException;
import br.ucsal.bes.poo20221.atividade03.exception.NomeVazioException;
import br.ucsal.bes.poo20221.atividade03.exception.ValorNaoInformadoException;

public class Professores extends Pessoa{
	
	private String titulacao;

	public Professores(String nome, String email, String telefone, String titulacao) throws EmailInvalidoException, ValorNaoInformadoException, NomeVazioException {
		super(nome, email, telefone);
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Professores -> Nome: " + getNome() + ", Email: " + getEmail() + ", Titulação: " + 
		getTitulacao() + ", Telefone: " + getTelefone() + "\n";
	}
	
	
}
