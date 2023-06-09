package br.ucsal.bes.poo20221.atividade03.commands;

import java.util.Scanner;

import br.ucsal.bes.poo20221.atividade03.domain.Alunos;
import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class CadastrarAlunoCommand implements Command {
    private static Scanner entrada = new Scanner(System.in);

    @Override
    public void execute() {
        Alunos aluno = new Alunos();
        try {
            System.out.println("Informe o nome: ");
            String nome = entrada.nextLine();
            aluno.setNome(nome);
            System.out.println("Informe o e-mail: ");
            String email = entrada.nextLine();
            aluno.setEmail(email);
            System.out.println("Informe o telefone: ");
            String telefone = entrada.nextLine();
            aluno.setTelefoneList(telefone);

            System.out.println("Informe a data de nascimento: ");
            String dataNasc = entrada.nextLine();
            aluno.setNascimento(dataNasc);
            System.out.println("Informe a escola de origem: ");
            String escola = entrada.nextLine();
            aluno.setEscola(escola);

            PessoaDAO.persistir(aluno);

            System.out.println("Aluno cadastrado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}