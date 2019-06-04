package com.netcracker.service;

import com.netcracker.dao.BooksDao;
import com.netcracker.dao.IDAO;
import com.netcracker.model.Books;
import com.netcracker.service.interfaces.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Comparator.comparing;

@Service("booksService")
public class BooksService implements IBooksService {
    @Autowired
    @Qualifier("booksDao")
    IDAO dao;

    @Autowired
    BooksDao booksDao;

    @Override
    public void add(Books entity) {
        dao.add(entity);
    }

    @Override
    public List<Books> findAll() {
        return dao.findAll();
    }

    @Override
    public Books findById(int id) {
        return (Books) dao.findById(id);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void updateById(int id, Books entity) {
        dao.updateById(id, entity);
    }

    @Override
    public int getRowCount() {
        return dao.getRowCount();
    }

    public void showUniqueBooks() {
        List<Books> books = findAll();
        Set<String> set = new HashSet<>();
        System.out.println("Unique Books:");
        for(Books book : books) {
            if(set.add(book.getName())) {
                System.out.print("Book name: " + book.getName());
                System.out.println(", cost: " + book.getCost());
            }

        }
        System.out.println();
    }

    @Override
    public void showWindowsAndExpensiveBooks() {
        booksDao.showWindowsAndExpensiveBooks();
    }
}
