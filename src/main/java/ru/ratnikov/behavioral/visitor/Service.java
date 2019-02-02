package ru.ratnikov.behavioral.visitor;

import ru.ratnikov.behavioral.visitor.elements.Body;
import ru.ratnikov.behavioral.visitor.elements.Engine;
import ru.ratnikov.behavioral.visitor.elements.Wheel;

public interface Service {

    void visit(Wheel element);

    void visit(Engine element);

    void visit(Body element);
}