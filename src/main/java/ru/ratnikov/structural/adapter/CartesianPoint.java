package ru.ratnikov.structural.adapter;

public class CartesianPoint implements Cartesian {
    @Override
    public void setPoint(double x, double y) {
        System.out.println("x: " + x + " y: " + y);
    }
}