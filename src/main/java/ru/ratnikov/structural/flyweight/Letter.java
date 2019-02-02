package ru.ratnikov.structural.flyweight;

public class Letter {
    private TypeParameters parameters;

    public Letter() {
        parameters = TypeParameters.DEFAULT;
    }

    public Letter(String typeName) {
        if (typeName.equals(TypeParameters.DEFAULT.getName())) {
            parameters = TypeParameters.DEFAULT;
        } else {
            parameters = new TypeParameters();
            parameters.setName(typeName);
        }
    }
}