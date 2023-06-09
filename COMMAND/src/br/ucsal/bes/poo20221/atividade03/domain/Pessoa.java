package br.ucsal.bes.poo20221.atividade03.domain;
import br.ucsal.bes.poo20221.atividade03.exception.EmailInvalidoException;
import br.ucsal.bes.poo20221.atividade03.exception.NomeVazioException;
import br.ucsal.bes.poo20221.atividade03.exception.ValorNaoInformadoException;

public class Pessoa {
	
	private String nome;
	private String email;
	private String telefone;
	
	public Pessoa(String nome, String email, String telefone) throws NomeVazioException, EmailInvalidoException, ValorNaoInformadoException {
		super();
		setNome(nome);
		setEmail(email);
		setTelefoneList(telefone);
	}

	public Pessoa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws NomeVazioException {
		nome = nome.trim();
		if(nome.isEmpty() || nome.matches(".*\\d.*")){
			throw new NomeVazioException("Nome inv�lido inserido...");
		}
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailInvalidoException {
		email = email.trim();
		String partes[] = email.split("@");

		if(!(email.contains("@")) || email.isEmpty() || partes[0].isEmpty() || partes[1].isEmpty()){
			throw new EmailInvalidoException("Email inv�lido inserido...");
		}
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefoneList(String telefone) throws ValorNaoInformadoException {
		telefone = telefone.trim();
		if (telefone.isEmpty() || !(telefone.matches("[0-9]+")) || telefone.length() != 11) {
			throw new ValorNaoInformadoException("Telefone inv�lido inserido...");
		}
		this.telefone = telefone;
	}
}
