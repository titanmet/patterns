package ru.ratnikov.creational.prototype;

public class StringPrototype implements Prototype {
    private final String name;

    public StringPrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public StringPrototype clone() {
        try {
            return (StringPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringPrototype that = (StringPrototype) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }
}