package br.com.projetofinal.projetointegrador.dao;

import java.util.List;

public interface IDao<T> {
    List<T> buscarTodos();
    T buscarPorId(Integer id);
    T cadastrar(T objeto);
    T editar(T objeto);
    void excluir(Integer id);
}
