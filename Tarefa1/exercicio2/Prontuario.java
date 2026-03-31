package exercicio2;

import java.util.LinkedList;

public class Prontuario {

    public static LinkedList<Prontuario> historico = new LinkedList<>();
    public Consulta consulta;
    public int i = 0;
    public String descricao;
    

    public void mostrarHistorico(){

        for ( Prontuario historico: historico) {
            i += 1;
            System.out.println("Prontuário " + i + ":");
            System.out.println("Médico responsável: " + historico.getConsulta().getResponsavel().getNome());
            
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
