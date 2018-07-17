package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Books {

    public static List<String> BOOK_TITLES;

    public Books(List<String> bookTitles) {
        BOOK_TITLES = bookTitles;
    }

    public void printTitles(PrintStream printStream) {
        String titles = String.join("\n", BOOK_TITLES);
        printStream.print(titles);
    }
}
