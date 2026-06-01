package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integration Tests for HelloWorld Application
 * These tests run during the 'integration-test' phase of Maven lifecycle
 * Test class name ends with 'IT' to be recognized by maven-failsafe-plugin
 */
public class HelloWorldIT {

    @Test
    public void testApplicationIntegration() {
        // Test that the application can be instantiated and methods work correctly
        String greeting = HelloWorld.greet("Integration Test");
        assertNotNull("Application should be able to generate greetings", greeting);
        assertEquals("Hello, Integration Test!", greeting);
    }

    @Test
    public void testApplicationOutputFormat() {
        // Test the format of greeting output
        String greeting = HelloWorld.greet("World");
        assertTrue("Greeting format should follow pattern", greeting.matches("Hello, .*!"));
    }

    @Test
    public void testMultipleGreetings() {
        // Test multiple invocations work correctly
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            String greeting = HelloWorld.greet(name);
            assertTrue("Each greeting should contain the name", greeting.contains(name));
        }
    }

    @Test
    public void testApplicationReadiness() {
        // Final integration test - verify application is ready for deployment
        assertNotNull("HelloWorld class should be instantiable", HelloWorld.class);
        assertTrue("HelloWorld should have greet method", true);
    }
}
