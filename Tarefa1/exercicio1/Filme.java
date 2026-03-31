package exercicio1;

import java.util.List;

public class Filme extends Conteudo {

    private int duracao; // minutos

    public Filme(String titulo, String diretor, List<String> elenco, int duracao) {
        super(titulo, diretor, elenco);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
}