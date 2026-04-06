package com.example;

public class App {
    public static void main(String[] args) {

        // UC1
        System.out.println("Hello World");

        // UC3
        String name;

        if (args.length > 0) {
            name = args[0];
        } else {
            name = "World";
        }

        System.out.println("Hello " + name);
    }
}