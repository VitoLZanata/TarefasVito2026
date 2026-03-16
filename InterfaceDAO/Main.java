package InterfaceDAO;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAOLista();
        // Se quiser usar banco:
        // ProdutoDAO dao = new ProdutoDAOJDBC(conexao);

        dao.inserir(new Produto(1, "Notebook", 3500));
        dao.inserir(new Produto(2, "Mouse", 80));
        dao.inserir(new Produto(3, "Teclado", 150));

        System.out.println("Lista de produtos:");
        List<Produto> produtos = dao.listar();
        for (Produto p : produtos) {
            System.out.println(p);
        }

        System.out.println("\nBuscar produto ID 2:");
        Produto p = dao.buscarPorId(2);
        System.out.println(p);

        System.out.println("\nRemovendo produto ID 1");
        dao.remover(1);

        System.out.println("\nLista atualizada:");
        for (Produto prod : dao.listar()) {
            System.out.println(prod);
        }
    }
}