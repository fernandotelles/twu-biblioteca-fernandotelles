package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;

public class BooksTest {
    @Test
    public void testItPrintsTheAvailableBookTitleWhenThereIsOnlyOneAvailableBook() {
        Book expectedBook = new Book("fernando", "fernando",1990);

        Books books = new Books(Collections.singletonList(expectedBook));

        final StringBuilder actualTitles = new StringBuilder();

        books.printBooks(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                actualTitles.append((char)b);
            }
        }));

        assertEquals(expectedBook, actualTitles.toString());
    }

    @Test
    public void testItPrintsTheAvailableBookTitlesWhenThereAreMultipleAvailableBooks() {
        Book aBook = new Book("fernando", "fernando",1990);
        Book anotherBook = new Book("crespusculo", "fernando",1991);
        Books books = new Books(Arrays.asList(aBook, anotherBook));

        final StringBuilder actualTitles = new StringBuilder();

        books.printBooks(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                actualTitles.append((char)b);
            }
        }));

        assertEquals(aBook.getName() + '\n' + anotherBook.getName(), actualTitles.toString());
    }

    @Test
    public void testIfBookListContainsSixBooks() {
        Books books = new Books(Arrays.asList(new Book("fernando", "fernando",1990),
                new Book("fernando", "fernando",1990),
                new Book("fernando", "fernando",1990),
                new Book("fernando", "fernando",1990)));

        assertEquals(4, books.BOOK_TITLES.size());
    }
}