package ru.ratnikov.creational.factory_method;

public class DogsHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Dog();
    }
}