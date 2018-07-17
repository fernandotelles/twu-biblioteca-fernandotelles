package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Books {

    public static List<Book> BOOK_TITLES;

    public Books(List<Book> bookTitles) {
        BOOK_TITLES = bookTitles;
    }

    public void printBooks(PrintStream printStream) {
        for (Book book : BOOK_TITLES) {
            printStream.print(book.getName());
        }
    }
}
