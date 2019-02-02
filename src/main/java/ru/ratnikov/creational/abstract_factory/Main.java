package ru.ratnikov.creational.abstract_factory;

public class Main {
    public static void main(String... args) {
        Service serviceWin = new Service(new WinGUIFactory());
        serviceWin.pressButton();

        Service serviceOSX = new Service(new OSXGUIFactory());
        serviceOSX.pressButton();
    }


}