package ru.ratnikov.structural.composite;

public class Main {
    public static void main(String[] args) {
        Unit unitA = new Soldier();
        Unit unitB = new Soldier();
        Unit unitC = new Panzer();

        unitA.move();
        unitB.attack();
        unitC.hold();

        System.out.println();

        UnitsGroup brigade = new UnitsGroup();
        brigade.addUnit(unitA);
        brigade.addUnit(unitB);
        brigade.addUnit(unitC);

        brigade.move();
        brigade.attack();
        brigade.hold();
    }
}