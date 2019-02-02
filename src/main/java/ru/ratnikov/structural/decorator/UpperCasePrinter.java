package ru.ratnikov.structural.decorator;

public class UpperCasePrinter extends PrinterDecorator {
    public UpperCasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String str) {
        super.print(str.toUpperCase());
    }
}