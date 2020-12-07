package com.company;

public enum Guys {
    Human ("Человек"),
    Thing ("Вещь");

    private final String Type;
    Guys(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}
