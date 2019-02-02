package ru.ratnikov.creational.singleton;

public class Singleton {
    private static Singleton singleton=new Singleton();
    private String message;

    private Singleton() {
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}