package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Conteudo {

    private List<Episodio> episodios;

    public Serie(String titulo, String diretor, List<String> elenco) {
        super(titulo, diretor, elenco);
        this.episodios = new ArrayList<>();
    }

    public void adicionarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void listarEpisodios() {
        System.out.println("Episódios da série " + titulo + ":");
        for (Episodio e : episodios) {
            System.out.println(e);
        }
    }
}