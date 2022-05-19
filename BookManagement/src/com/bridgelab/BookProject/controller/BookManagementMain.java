package com.bridgelab.BookProject.controller;

import com.bridgelab.BookProject.UIFiles.UIIMPL;
import com.bridgelab.BookProject.model.BooksData;
import com.bridgelab.BookProject.services.BooksIMPL;

public class BookManagementMain {
    public static void main(String[] args) {
        BooksData book1 = new BooksData(1,"Book1","Dell",700,10);
        BooksIMPL.books.add(book1);
        BooksData book2 = new BooksData(2,"Book2","VLC",800,10);
        BooksIMPL.books.add(book2);
        BooksData book3 = new BooksData(3,"Book3","IBM",900,10);
        BooksIMPL.books.add(book3);

        UIIMPL.UI();
    }
}
