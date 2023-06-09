package br.ucsal.bes.poo20221.atividade03.commands;

import java.util.Scanner;

import br.ucsal.bes.poo20221.atividade03.domain.Professores;
import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class CadastrarProfessorCommand implements Command {
    private static Scanner entrada = new Scanner(System.in);

    @Override
    public void execute() {
        Professores professor = new Professores();
        try {
            System.out.println("Informe o nome: ");
            String nome = entrada.nextLine();
            professor.setNome(nome);
            System.out.println("Informe o e-mail: ");
            String email = entrada.nextLine();
            professor.setEmail(email);
            System.out.println("Informe o telefone: ");
            String telefone = entrada.nextLine();
            professor.setTelefoneList(telefone);

            System.out.println("Informe a titulação: ");
            String titulacao = entrada.nextLine();
            professor.setTitulacao(titulacao);

            PessoaDAO.persistir(professor);

            System.out.println("Professor cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
