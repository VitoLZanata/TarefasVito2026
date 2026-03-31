package exercicio1;

public class Episodio {

    private String titulo;
    private int numero;
    private int duracao; // minutos

    public Episodio(String titulo, int numero, int duracao) {
        this.titulo = titulo;
        this.numero = numero;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Ep " + numero + " - " + titulo;
    }
}