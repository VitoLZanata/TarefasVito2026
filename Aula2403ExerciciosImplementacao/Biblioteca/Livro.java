package Aula2403ExerciciosImplementacao.Biblioteca;

public class Livro{
    String titulo;
    String edicao;
    int ano;
    String editor;
    String[] ListaAutores;
    int qtdAcervo;

    public Livro(String titulo, String edicao, int ano, String editor, String[] listaAutores, int qtdAcervo) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.editor = editor;
        ListaAutores = listaAutores;
        this.qtdAcervo = qtdAcervo;
    }

    public Livro(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String[] getListaAutores() {
        return ListaAutores;
    }

    public void setListaAutores(String[] ListaAutores) {
        this.ListaAutores = ListaAutores;
    }

    public int getQtdAcervo() {
        return qtdAcervo;
    }

    public void setQtdAcervo(int qtdAcervo) {
        this.qtdAcervo = qtdAcervo;
    }
    
}