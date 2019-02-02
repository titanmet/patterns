package ru.ratnikov.creational.abstract_factory;

public class Service {
    private final Button button;
    //private final Window window;
    //private final Menu menu;

    public Service(GUIFactory factory) {
        this.button = factory.createButton();
    }

    public void pressButton() {
        button.printName();
    }
}