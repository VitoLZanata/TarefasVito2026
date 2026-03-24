package Aula2403ExerciciosImplementacao;

public class Professor extends Pessoa{
    String departamento;

    public Professor(String departamento, String dataNas, String nome) {
        super(dataNas, nome);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
