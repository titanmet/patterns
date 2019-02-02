package ru.ratnikov.creational.factory_method;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}