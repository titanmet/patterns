package ru.ratnikov.creational.factory_method;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}