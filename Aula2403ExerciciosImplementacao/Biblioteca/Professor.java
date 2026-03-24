package Aula2403ExerciciosImplementacao.Biblioteca;

public class Professor extends Pessoa{
    String departamento;

    public Professor(String departamento, String dataNas, String nome) {
        super(dataNas, nome);
        this.departamento = departamento;
    }

    public Professor(){}

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}
