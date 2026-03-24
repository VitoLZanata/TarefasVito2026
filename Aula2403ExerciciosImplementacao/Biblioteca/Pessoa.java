package Aula2403ExerciciosImplementacao.Biblioteca;

public class Pessoa  {
    String dataNas;
    String nome;

    public Pessoa(){
    }

    public Pessoa(String dataNas, String nome) {
        this.dataNas = dataNas;
        this.nome = nome;
    }

    public String getDataNas() {
        return dataNas;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
