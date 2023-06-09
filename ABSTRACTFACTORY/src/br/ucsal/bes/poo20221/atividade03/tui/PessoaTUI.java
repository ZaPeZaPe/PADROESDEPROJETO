package br.ucsal.bes.poo20221.atividade03.tui;

import java.util.Scanner;
import br.ucsal.bes.poo20221.atividade03.business.PessoaBO;
import br.ucsal.bes.poo20221.atividade03.domain.Alunos;
import br.ucsal.bes.poo20221.atividade03.domain.Pessoa;
import br.ucsal.bes.poo20221.atividade03.domain.PessoaFactory;
import br.ucsal.bes.poo20221.atividade03.domain.Professores;

public class PessoaTUI {
	private static Scanner entrada = new Scanner(System.in);

	public static void InformarPessoa(Integer tipo) {
    Pessoa pessoa = PessoaFactory.get(tipo);
    try {
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        pessoa.setNome(nome);
        System.out.println("Informe o e-mail: ");
        String email = entrada.nextLine();
        pessoa.setEmail(email);
        System.out.println("Informe o telefone: ");
        String telefone = entrada.nextLine();
        pessoa.setTelefoneList(telefone);

        switch (tipo) {
            case 1 -> {
                Alunos aluno = (Alunos) pessoa;
                System.out.println("Informe a data de nascimento: ");
                String dataNasc = entrada.nextLine();
                aluno.setNascimento(dataNasc);
                System.out.println("Informe a escola de origem: ");
                String escola = entrada.nextLine();
                aluno.setEscola(escola);
                PessoaBO.cadastrarPessoa(aluno);
            }
            case 2 -> {
                Professores professor = (Professores) pessoa;
                System.out.println("Informe a titulacao: ");
                String titulacao = entrada.nextLine();
                professor.setTitulacao(titulacao);
                PessoaBO.cadastrarPessoa(professor);
            }
            default -> {
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
	}
}
