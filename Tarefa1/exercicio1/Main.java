package exercicio1;
import java.util.Scanner;

/*Problema 1 – Plataforma de Streaming Uma empresa está criando um sistema
semelhante à Netflix.
O sistema deve permitir que usuários criarem perfis onde cada perfil pode assistir filmes e séries. 
Cada filme possui elenco e diretor. 
Um usuário pode ter vários perfis e perfis podem assistir vários conteúdos. 
O sistema deve permitir consultar:

Perfis de um usuário.
Conteúdos assistidos por um perfil.
Elenco de um filme. 

*/

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Criando Filme
        Filme filme = new Filme(
                "Interestelar",
                "Christopher Nolan",
                Arrays.asList("Matthew McConaughey", "Anne Hathaway"),
                169
        );

        // Criando Série
        Serie serie = new Serie(
                "Stranger Things",
                "Irmãos Duffer",
                Arrays.asList("Millie Bobby Brown", "Finn Wolfhard")
        );

        // Criando Episódios
        Episodio ep1 = new Episodio("O Desaparecimento de Will", 1, 50);
        Episodio ep2 = new Episodio("A Estranha na Rua Maple", 2, 48);

        serie.adicionarEpisodio(ep1);
        serie.adicionarEpisodio(ep2);

        // Criando Usuário
        Usuario usuario = new Usuario("João", "joao@email.com");

        // Criando Perfis
        Perfil perfil1 = new Perfil("João");
        Perfil perfil2 = new Perfil("Infantil");

        usuario.adicionarPerfil(perfil1);
        usuario.adicionarPerfil(perfil2);

        // Assistindo conteúdos
        perfil1.assistirFilme(filme);
        perfil1.assistirEpisodio(serie, ep1);
        perfil2.assistirEpisodio(serie, ep2);

        System.out.println("\n--- CONSULTAS ---\n");

        // Perfis do usuário
        usuario.listarPerfis();

        System.out.println();

        // Histórico de um perfil
        perfil1.listarHistorico();

        System.out.println();

        // Elenco de um filme
        filme.exibirElenco();

        System.out.println();

        // Episódios da série
        serie.listarEpisodios();
    }
}