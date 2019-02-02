package ru.ratnikov.behavioral.observer;

public class OutObserver implements Observer {
    @Override
    public void notify(Event event) {
        System.out.println(event.getClass());
    }
}