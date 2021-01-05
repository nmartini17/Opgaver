package com.company.Bog;

import java.util.Objects;

public class Bog {
    private int isbn;
    private String title;
    private int year;

    public Bog(int ISBNnr, String title, int year) {
        this.isbn = ISBNnr;
        this.title = title;
        this.year = year;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bog{";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bog bog = (Bog) o;
        return isbn == bog.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }
}