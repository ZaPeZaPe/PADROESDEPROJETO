package br.ucsal.bes.poo20221.atividade03.domain;

import br.ucsal.bes.poo20221.atividade03.exception.EmailInvalidoException;
import br.ucsal.bes.poo20221.atividade03.exception.NomeVazioException;
import br.ucsal.bes.poo20221.atividade03.exception.ValorNaoInformadoException;

public class Alunos extends Pessoa{
	private String nascimento;
	private String escola;
	
	public Alunos(String nome, String email, String telefone, String nascimento, String escola) throws EmailInvalidoException, ValorNaoInformadoException, NomeVazioException {
		super(nome, email, telefone);
		this.nascimento = nascimento;
		this.escola = escola;
	}

	public Alunos() { super(); }

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	@Override
	public String toString() {
		return "Alunos -> Nome: " + getNome() + ", Email: " + getEmail() + ", Escola: " + getEscola() + 
				", Data nascimento: " + getNascimento() + ", Telefone: " + getTelefone() + "\n";
	}
}
