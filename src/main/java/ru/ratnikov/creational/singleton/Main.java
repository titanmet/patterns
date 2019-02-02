package ru.ratnikov.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.getInstance().setMessage("Hello");

        System.out.println(Singleton.getInstance().getMessage());
    }
}