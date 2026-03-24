package Aula2403ExerciciosImplementacao.FolhaPagamento;

public class FuncionarioBonificado extends FuncionarioComissado {
    double bonus;

    public FuncionarioBonificado(String nome, double salarioBase, double totalVendas, double percentualComissao, double valorBonus) {
        super(nome, salarioBase, totalVendas, percentualComissao);
        this.bonus = valorBonus;
    }

    public FuncionarioBonificado() {
        super();
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double valorBonus) {
        this.bonus = valorBonus;
    }
    
}
