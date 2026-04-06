package com.example;

public class App {
    public static void main(String[] args) {

        // UC1
        System.out.println("Hello World");

        // UC5
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}