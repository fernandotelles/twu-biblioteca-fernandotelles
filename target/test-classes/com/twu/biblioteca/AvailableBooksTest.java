package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;

public class AvailableBooksTest {
    @Test
    public void testItPrintsTheAvailableBookTitleWhenThereIsOnlyOneAvailableBook() {
        String expectedTitles = "fernando";

        Books books = new Books(Collections.singletonList(expectedTitles));

        final StringBuilder actualTitles = new StringBuilder();

        books.printTitles(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                actualTitles.append((char)b);
            }
        }));

        assertEquals(expectedTitles, actualTitles.toString());
    }

    @Test
    public void testItPrintsTheAvailableBookTitlesWhenThereAreMultipleAvailableBooks() {
        String aBook = "fernando";
        String anotherBook = "crepusculo";
        Books books = new Books(Arrays.asList(aBook, anotherBook));

        final StringBuilder actualTitles = new StringBuilder();

        books.printTitles(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                actualTitles.append((char)b);
            }
        }));

        assertEquals(aBook + '\n' + anotherBook, actualTitles.toString());
    }

    @Test
    public void testIfBookListContainsSixBooks() {
        Books books = new Books(Arrays.asList("a","b", "c", "d", "e","f"));
        assertEquals(6, books.BOOK_TITLES.size());
    }
}