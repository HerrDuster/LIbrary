package ua.com.duster.shop.dao;

import java.util.List;

public interface GeneralDAO<T> {

    List<T> getAll();
    T get (Long id);
    void save(T obj);
    void delete(T obj);

    List<T> search (String... args);
}
