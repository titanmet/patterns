package ru.ratnikov.behavioral.visitor.services;

import ru.ratnikov.behavioral.visitor.Service;
import ru.ratnikov.behavioral.visitor.elements.Body;
import ru.ratnikov.behavioral.visitor.elements.Engine;
import ru.ratnikov.behavioral.visitor.elements.Wheel;

public class CarWashService implements Service {
    @Override
    public void visit(Wheel element) {
        System.out.println("Washing: " + element.getName());
    }

    @Override
    public void visit(Engine element) {
        System.out.println("Washing: " + element.getName());
    }

    @Override
    public void visit(Body element) {
        System.out.println("Washing: " + element.getName());
    }
}