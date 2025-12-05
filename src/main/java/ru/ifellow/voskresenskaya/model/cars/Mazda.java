package ru.ifellow.voskresenskaya.model.cars;

import ru.ifellow.voskresenskaya.Car;

public class Mazda extends Car {

    private String model;
    private int year;
    private boolean automatic;
    private String color;
    private int mileage;
    private int owners;

    // Конструктор — всегда должен быть внутри класса!
    public Mazda(String model, int year, boolean automatic, String color, int mileage, int owners) {
        super(model, year, automatic, color, mileage,owners);

    }


}