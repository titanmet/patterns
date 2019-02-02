package ru.ratnikov.behavioral.observer;

@FunctionalInterface
public interface Observer {
    void notify(Event event);
}