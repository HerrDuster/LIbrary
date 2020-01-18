package ua.com.duster.shop.dao;

import ua.com.duster.shop.entity.Book;

import java.util.List;

public interface BookDAO extends GeneralDAO<Book>{
    List<Book> findTopBook(int limit);
}
