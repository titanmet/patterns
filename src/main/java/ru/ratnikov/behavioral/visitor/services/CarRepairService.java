package ru.ratnikov.behavioral.visitor.services;

import ru.ratnikov.behavioral.visitor.Service;
import ru.ratnikov.behavioral.visitor.elements.Body;
import ru.ratnikov.behavioral.visitor.elements.Engine;
import ru.ratnikov.behavioral.visitor.elements.Wheel;

public class CarRepairService implements Service {
    @Override
    public void visit(Wheel element) {
        System.out.println("Repairing: " + element.getName());
    }

    @Override
    public void visit(Engine element) {
        System.out.println("Repairing: " + element.getName());
    }

    @Override
    public void visit(Body element) {
        System.out.println("Repairing: " + element.getName());
    }
}