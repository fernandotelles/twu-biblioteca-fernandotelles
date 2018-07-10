package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Assert;



public class WelcomeTest {

    @Test
    public void testHelloWorld() {
        Welcome welcome = new Welcome();
        Assert.assertEquals("Hello, World!", welcome.hello());
    }
}
