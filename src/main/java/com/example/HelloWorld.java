package com.example;

/**
 * Hello World Application for Maven Lifecycle Demonstration
 */
public class HelloWorld {

    /**
     * Main method that prints Hello World
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== Maven Lifecycle Demo =====");
        System.out.println("Hello, World!");
        System.out.println("Maven Lifecycle Stages:");
        System.out.println("1. Validate");
        System.out.println("2. Compile");
        System.out.println("3. Test");
        System.out.println("4. Package");
        System.out.println("5. Integration Test");
        System.out.println("6. Verify");
        System.out.println("7. Install");
        System.out.println("8. Deploy");
        System.out.println("================================");
    }

    /**
     * Utility method to return a greeting
     * @param name The name to greet
     * @return Greeting message
     */
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}
