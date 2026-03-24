package br.edu.ifpr.dao.generics;

import br.edu.ifpr.dao.Produto;
import java.util.ArrayList;
import java.util.List;

public class DAOLista<T> implements GenericDAO<T> {
    private List<T> lista;

    public DAOLista() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void inserir(T object) {
        lista.add(object);
    }

    @Override
    public List<T> listar() {
        return lista;
    }
    
    @Override
    public T buscarPorId(int id) {
        for (T obj : lista) {
            if (obj instanceof Produto) {
                Produto p = (Produto) obj;
                if (p.getId() == id) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override
    public void remover(int id) {
        T objetoRemover = null;

        for (T obj : lista) {
            if (obj instanceof Produto) {
                Produto p = (Produto) obj;
                if (p.getId() == id) {
                    objetoRemover = obj;
                    break;
                }
            }
        }

        if (objetoRemover != null) {
            lista.remove(objetoRemover);
        }
    }
}