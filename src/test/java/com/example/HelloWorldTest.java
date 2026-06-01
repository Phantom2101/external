package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit Tests for HelloWorld Application
 * These tests run during the 'test' phase of Maven lifecycle
 */
public class HelloWorldTest {

    @Test
    public void testGreetMethod() {
        String result = HelloWorld.greet("World");
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testGreetWithDifferentName() {
        String result = HelloWorld.greet("Maven");
        assertEquals("Hello, Maven!", result);
    }

    @Test
    public void testGreetNotNull() {
        String result = HelloWorld.greet("Test");
        assertNotNull("Greeting should not be null", result);
    }

    @Test
    public void testGreetContainsName() {
        String result = HelloWorld.greet("Developer");
        assertTrue("Greeting should contain the name", result.contains("Developer"));
    }
}
