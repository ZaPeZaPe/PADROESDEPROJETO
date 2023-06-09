package br.ucsal.bes.poo20221.atividade03.commands;

import br.ucsal.bes.poo20221.atividade03.persistence.PessoaDAO;

public class ObterListaCommand implements Command{
    @Override
    public void execute() {
        System.out.println(PessoaDAO.obter());
    }
}