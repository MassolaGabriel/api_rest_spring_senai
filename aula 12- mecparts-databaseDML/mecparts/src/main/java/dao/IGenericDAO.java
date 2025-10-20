package dao;

import java.util.List;
import java.util.Optional;

public interface IGenericDAO<T> {
    T create(T obj);
    List<T> readAll();
    Optional<T> readById(Integer id);
    Optional<T> readByName(String nome);
    void update(T obj);
    void delete(T obj);
}
