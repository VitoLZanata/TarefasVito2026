package Aula2403ExerciciosImplementacao.Biblioteca;

public class Biblioteca {
    String nomeBiblioteca;
    String endereco;
    String ListaLivros;

    public Biblioteca(String nomeBiblioteca, String endereco, String ListaLivros) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.endereco = endereco;
        this.ListaLivros = ListaLivros;
    }

    public Biblioteca(){}

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getListaLivros() {
        return ListaLivros;
    }

    public void setListaLivros(String ListaLivros) {
        this.ListaLivros = ListaLivros;
    }

    
}
