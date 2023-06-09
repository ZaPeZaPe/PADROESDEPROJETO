package br.ucsal.bes.poo20221.atividade03.tui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.ucsal.bes.poo20221.atividade03.commands.CadastrarAlunoCommand;
import br.ucsal.bes.poo20221.atividade03.commands.CadastrarProfessorCommand;
import br.ucsal.bes.poo20221.atividade03.commands.Command;
import br.ucsal.bes.poo20221.atividade03.commands.ObterListaCommand;

public class MenuTUI {

    private static Scanner entrada = new Scanner(System.in);
    private static boolean continuar = true;
    static int opcao;

    private static Map<Integer, Command> comandos = new HashMap<>();

    public static void executar() {
        configurarComandos();

        while (continuar) {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            Command comando = comandos.get(opcao);
            if (comando != null) {
                comando.execute();
            } else {
                continuar = false;
            }
        }
    }

    private static void configurarComandos() {
        comandos.put(1, new CadastrarAlunoCommand());
        comandos.put(2, new CadastrarProfessorCommand());
        comandos.put(3, new ObterListaCommand());
    }

    private static void exibirMenu() {
        System.out.println("1- Cadastrar aluno");
        System.out.println("2- Cadastrar professor");
        System.out.println("3- Obter lista");
        System.out.println("4- Sair");
    }

}
