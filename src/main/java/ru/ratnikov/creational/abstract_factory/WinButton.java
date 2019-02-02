package ru.ratnikov.creational.abstract_factory;

public class WinButton implements Button {
    @Override
    public void printName() {
        System.out.println("Win button");
    }
}