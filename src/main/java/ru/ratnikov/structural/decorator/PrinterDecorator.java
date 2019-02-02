package ru.ratnikov.structural.decorator;

public class PrinterDecorator implements Printer {
    private final Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        printer.print(str);
    }
}