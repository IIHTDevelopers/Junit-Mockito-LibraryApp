package com.libraryapp.service;

import java.util.ArrayList;
import java.util.List;

import com.libraryapp.validation.ValidationUtils;

public class LibraryManager {
    private List<String> books;
    
    private ValidationUtils utils;

    public LibraryManager() {
        books = new ArrayList<>();
        utils = new ValidationUtils();
    }

    public List<String> addBook(String book) {
        if (!this.utils.isNullOrEmpty(book)) {
            books.add(book);
            System.out.println(book + " has been added to the library.");
        } else {
            System.out.println("Invalid book name.");
        }
        return books;
    }

    public List<String> borrowBook(String book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("You have borrowed " + book + ".");
        } else {
            System.out.println("Book is not available.");
        }
        return books;
    }

    public List<String> returnBook(String book) {
        if (!this.utils.isNullOrEmpty(book)) {
            books.add(book);
            System.out.println("You have returned " + book + ".");
        } else {
            System.out.println("Invalid book name.");
        }
        return books;
    }

}