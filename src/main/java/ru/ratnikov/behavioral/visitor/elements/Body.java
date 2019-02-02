package ru.ratnikov.behavioral.visitor.elements;

import ru.ratnikov.behavioral.visitor.CarElement;
import ru.ratnikov.behavioral.visitor.Service;

public class Body implements CarElement {
    @Override
    public String getName() {
        return "body";
    }

    public void accept(Service visitor) {
        visitor.visit(this);
    }
}