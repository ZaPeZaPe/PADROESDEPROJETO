package br.ucsal.bes.poo20221.atividade03.tui;

import java.util.Scanner;

import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class MenuTUI {
	
	
	private static Scanner entrada = new Scanner(System.in);
	private static boolean continuar = true;
	static int opcao;
	
	public static void executar() {
		while(continuar) {
			System.out.println("1- Cadastrar aluno");
			System.out.println("2- Cadastrar professor");
			System.out.println("3- Obter lista");
			System.out.println("4- Sair");
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch(opcao) {
			case 1 -> PessoaTUI.InformeAluno();
			case 2 -> PessoaTUI.InformeProfessor();
			case 3 -> PessoaDAO.obter();
			default -> continuar = false;
			}
		}
	}
}
