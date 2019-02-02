package ru.ratnikov.structural.composite;

public class Soldier implements Unit {
    @Override
    public void move() {
        System.out.println("Yes sir!");
    }

    @Override
    public void attack() {
        System.out.println("Attacking!");
    }

    @Override
    public void hold() {
        System.out.println("Stated to dig");
    }
}