package ru.ifellow.voskresenskaya;

public class Haval extends Car {
    private String model;
    private int year;
    private boolean automatic;
    private String color;
    private int mileage;
    private int owners;

    // Конструктор — всегда должен быть внутри класса!
    public Haval(String model, int year, boolean automatic, String color, int mileage, int owners) {
        super(model, year, automatic, color, mileage,owners);

    }

    // Метод должен иметь возвращаемый тип (String)
//    public String getInfo() {
//        return String.format(
//                "Model: %s | Year: %d | Automatic: %s | Color: %s | Mileage: %d km | Owners: %d",
//                model,
//                year,
//                automatic ? "automatic" : "manual",
//                color,
//                mileage,
//                owners
//        );
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    // owners — это int, значит и параметр должен быть int!
//    public void setOwners(int owners) {
//        this.owners = owners;
//    }
}