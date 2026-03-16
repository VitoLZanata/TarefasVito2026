package InterfaceDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOJDBC implements ProdutoDAO {

    private Connection conexao;

    public ProdutoDAOJDBC(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public void inserir(Produto produto) {
        String sql = "INSERT INTO produto (id, nome, preco) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getNome());
            stmt.setDouble(3, produto.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();

        String sql = "SELECT * FROM produto";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto p = new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco")
                );

                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Produto buscarPorId(int id) {
        String sql = "SELECT * FROM produto WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Produto(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void remover(int id) {
        String sql = "DELETE FROM produto WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}