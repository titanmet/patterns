package ru.ratnikov.behavioral.visitor.elements;

import ru.ratnikov.behavioral.visitor.CarElement;
import ru.ratnikov.behavioral.visitor.Service;

public class Wheel implements CarElement {
    @Override
    public String getName() {
        return "wheel";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}