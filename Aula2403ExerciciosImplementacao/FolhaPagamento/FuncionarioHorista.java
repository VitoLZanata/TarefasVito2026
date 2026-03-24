package Aula2403ExerciciosImplementacao.FolhaPagamento;

public class FuncionarioHorista extends Funcionario{
    double valorHora;
    int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, 0); // Salário base não é aplicável para funcionário horista
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public FuncionarioHorista(){}

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    

}
