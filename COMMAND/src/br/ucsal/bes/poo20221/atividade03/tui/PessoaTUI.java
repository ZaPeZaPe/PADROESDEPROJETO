package br.ucsal.bes.poo20221.atividade03.tui;

import java.util.Scanner;
import br.ucsal.bes.poo20221.atividade03.business.PessoaBO;
import br.ucsal.bes.poo20221.atividade03.domain.Alunos;
import br.ucsal.bes.poo20221.atividade03.domain.Professores;
import br.ucsal.bes.poo20221.atividade03.exception.EmailInvalidoException;
import br.ucsal.bes.poo20221.atividade03.exception.NomeVazioException;
import br.ucsal.bes.poo20221.atividade03.exception.ValorNaoInformadoException;

public class PessoaTUI {
	private static Scanner entrada = new Scanner(System.in);

	public static void InformeAluno() {
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe o e-mail: ");
		String email = entrada.nextLine();
		System.out.println("Informe o telefone: ");
		String telefone = entrada.nextLine();
		System.out.println("Informe a data de nascimento: ");
		String dataNasc = entrada.nextLine();
		System.out.println("Informe a escola de origem: ");
		String escola = entrada.nextLine();
		try {
			Alunos aluno = new Alunos(nome, email, telefone, dataNasc, escola);
			PessoaBO.cadastrarAluno(aluno);
		} catch (NomeVazioException e) {
			System.out.println(e.getMessage());
		} catch (EmailInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ValorNaoInformadoException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Email inválido inserido...");
		}
	}
	
	
	public static void InformeProfessor() {
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		System.out.println("Informe o e-mail: ");
		String email = entrada.nextLine();
		System.out.println("Informe o telefone: ");
		String telefone = entrada.nextLine();
		System.out.println("Informe a titulação: ");
		String titulacao = entrada.nextLine();
		try {
			Professores professor = new Professores(nome, email, telefone, titulacao);
			PessoaBO.cadastrarProfessor(professor);
		} catch (NomeVazioException e) {
			System.out.println(e.getMessage());
		} catch (EmailInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (ValorNaoInformadoException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Email inválido inserido...");
		}
	}
}
