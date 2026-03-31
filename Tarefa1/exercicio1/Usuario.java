package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    private List<Perfil> perfis;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.perfis = new ArrayList<>();
    }

    public void adicionarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public void listarPerfis() {
        System.out.println("Perfis do usuário " + nome + ":");
        for (Perfil p : perfis) {
            System.out.println("- " + p.getNome());
        }
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }
}