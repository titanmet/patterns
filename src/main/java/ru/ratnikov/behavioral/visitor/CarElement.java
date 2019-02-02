package ru.ratnikov.behavioral.visitor;

public interface CarElement {
    String getName();

    /**
     * Method accept in the Visitor pattern
     *
     * @param visitor to visit the element
     */
    void accept(Service visitor);
}