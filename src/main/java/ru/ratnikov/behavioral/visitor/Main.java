package ru.ratnikov.behavioral.visitor;

import ru.ratnikov.behavioral.visitor.services.CarRepairService;
import ru.ratnikov.behavioral.visitor.services.CarWashService;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.doService(new CarRepairService());
        car.doService(new CarWashService());
    }
}