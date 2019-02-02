package ru.ratnikov.creational.factory_method;

public class CatsHouse extends AnimalHouse {
    @Override
    protected Animal getAnimal() {
        return new Cat();
    }
}