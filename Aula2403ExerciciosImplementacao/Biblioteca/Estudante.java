package Aula2403ExerciciosImplementacao.Biblioteca;

public class Estudante extends Pessoa{
    String curso;
    int numMatricula;
    int anoIngresso;

    public Estudante(String curso, String dataNas, String nome) {
        super(dataNas, nome);
        this.curso = curso;
    }

    public Estudante(){}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    
}