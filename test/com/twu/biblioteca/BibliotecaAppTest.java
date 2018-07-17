package com.twu.biblioteca;

import org.junit.Test;

import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private static final String WELCOME_MESSAGE = "Hello!";

    @Test
    public void testAppShowsAWelcomeMessageWhenItStarts() {
        final StringBuilder actualWelcomeMessage = new StringBuilder();

        System.setOut(new PrintStream(new OutputStream() {
            @Override
            public void write(int b) {
                actualWelcomeMessage.append((char)b);
            }
        }));

        BibliotecaApp.main(new String[0]);

        assertEquals(WELCOME_MESSAGE, actualWelcomeMessage.toString());
    }


}