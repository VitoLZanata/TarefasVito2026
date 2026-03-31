package exercicio2;



/*Problema 2 – Sistema de Hospital
Um hospital precisa de um sistema interno. Sabe-se que o hospital possui vários médicos e vários pacientes. 
Pacientes podem ter várias consultas e cada consulta possui um médico responsável. 
Uma consulta gera um prontuário. O prontuário não existe sem a consulta. 
O sistema deve permitir:
Listar consultas de um paciente.
Mostrar médico responsável.
Mostrar histórico de prontuários. */

public class Main {

    public static void main(String[] args) {
        Paciente paulo = new Paciente("Paulo", "123456789");

        Medico drSilva = new Medico();
        drSilva.setNome("Dr. Silva");
        drSilva.setEspecializacao("Cardiologia");

        Consulta consulta1 = new Consulta();
        consulta1.setResponsavel(drSilva);
        consulta1.setCliente(paulo);

        Prontuario prontuario1 = new Prontuario();
        prontuario1.setConsulta(consulta1);
        prontuario1.setDescricao("Paciente com sintomas de dor no peito.");
        Prontuario.historico.add(prontuario1);

        consulta1.prontuario = prontuario1;

        paulo.consultas.add(consulta1);

        System.out.println("Consultas de " + paulo.getNome() + ":");
        paulo.listarConsultas();

        prontuario1.mostrarHistorico();
    }
}
