package com.company.Bog;

import java.util.ArrayList;
import java.util.List;

public class Bibliotek {
    List<Bog> books;

    public Bibliotek() {
        books = new ArrayList<>();
    }
    public void addBook(Bog bog) {
        books.add(bog);
    }

    public List<Bog> getBooks() {
        return books;
    }

    public boolean containsBook(Bog bog) {
        boolean retVal = false;
        for (Bog b : books) {
            if (bog.equals(b.getIsbn())) {
                retVal = true;
            } else {
                retVal = false;
            }
        }
        System.out.println(books.size());
        return retVal;
    }

}