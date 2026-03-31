package exercicio1;

import java.util.List;

public abstract class Conteudo {

    protected String titulo;
    protected String diretor;
    protected List<String> elenco;

    public Conteudo(String titulo, String diretor, List<String> elenco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void exibirElenco() {
        System.out.println("Elenco de " + titulo + ":");
        for (String ator : elenco) {
            System.out.println("- " + ator);
        }
    }
}