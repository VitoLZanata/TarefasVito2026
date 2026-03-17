package br.edu.ifpr.dao.generics;

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
        for (T t : lista) {
            
        }
    }

    @Override
    public void remover(int id) {
        lista.remove(object);
    }

}
