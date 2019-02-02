package ru.ratnikov.creational.object_pool;

@FunctionalInterface
public interface ResourceFactory {
    Resource get();
}