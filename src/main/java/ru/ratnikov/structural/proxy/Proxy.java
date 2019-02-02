package ru.ratnikov.structural.proxy;

public final class Proxy implements Subject {
    private final Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doIt() {
        System.out.println("doIt() call logged");
        subject.doIt();
    }
}