package ru.ratnikov.behavioral.visitor;

import ru.ratnikov.behavioral.visitor.elements.Body;
import ru.ratnikov.behavioral.visitor.elements.Engine;
import ru.ratnikov.behavioral.visitor.elements.Wheel;

import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Car {
    private final Body body;
    private final Engine engine;
    private final Wheel[] wheels;

    public Car() {
        engine = new Engine();
        body = new Body();
        wheels = new Wheel[4];
        Arrays.fill(wheels, new Wheel());
    }

    public void doService(Service service) {
        body.accept(service);
        engine.accept(service);
        for (Wheel wheel : wheels) {
            wheel.accept(service);
        }
    }
}