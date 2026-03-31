package exercicio2;
import java.util.LinkedList;

public class Paciente {
    public String nome;
    public String cpf;
    public LinkedList<Consulta> consultas = new LinkedList<>();

    public Paciente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void listarConsultas() {
        for (Consulta consulta : consultas) {
            System.out.println("Consulta com o médico: " + consulta.getResponsavel().getNome());
            System.out.println("Descrição do prontuário: " + consulta.prontuario.getDescricao());
        }
    }

    public LinkedList<Consulta> getConsultas() {
        return consultas;
    }
    public void setConsultas(LinkedList<Consulta> consultas) {
        this.consultas = consultas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    
}
