package ru.ratnikov.creational.abstract_factory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}