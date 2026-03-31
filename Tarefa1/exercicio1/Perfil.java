package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

    private String nome;
    private List<String> historico;

    public Perfil(String nome) {
        this.nome = nome;
        this.historico = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void assistirFilme(Filme filme) {
        historico.add("Filme: " + filme.getTitulo());
    }

    public void assistirEpisodio(Serie serie, Episodio episodio) {
        historico.add("Série: " + serie.getTitulo() +
                      " - Ep " + episodio.getNumero() +
                      " (" + episodio.getTitulo() + ")");
    }

    public void listarHistorico() {
        System.out.println("Histórico do perfil " + nome + ":");
        for (String item : historico) {
            System.out.println("- " + item);
        }
    }
}