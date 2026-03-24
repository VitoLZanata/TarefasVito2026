package Aula2403ExerciciosImplementacao.FolhaPagamento;

public class FuncionarioComissado extends Funcionario {
    double vendasMensais;
    double percentualComissao;

    public FuncionarioComissado(String nome, double salarioBase, double totalVendas, double percentualComissao) {
        super(nome, salarioBase);
        this.vendasMensais = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public FuncionarioComissado() {
        super();
    }

    public double calcularSalario() {
        return getSalarioBase() + (vendasMensais * percentualComissao);
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double totalVendas) {
        this.vendasMensais = totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
