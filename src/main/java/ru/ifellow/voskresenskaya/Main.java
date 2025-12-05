
package ru.ifellow.voskresenskaya;

import ru.ifellow.voskresenskaya.model.cars.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {

    public static void carsAfter2006(List<Car> cars) {
        for (Car i : cars) {
            if (i.isAfterYear(2006)) {
                System.out.println(i.getInfo());
            } else {
                System.out.println(i.getModel() + " — устаревший авто");
            }
        }
    }

    public static void changeColor(List<Car> cars, String oldColor, String newColor) {
        for (Car c : cars) {
            if (c.getColor().equals(oldColor)) {
                c.setColor(newColor);
            }
        }
    }

    public static void printNewestCar(List<Car> cars) {
        cars.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .ifPresent(car -> System.out.println("Newest: " + car.getInfo()));
    }


    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Toyota("Camry", 2020, false, "Black", 2500, 1));
        cars.add(new Toyota("Avensis", 2008, false, "Black", 500000, 8));
        cars.add(new Suzuki("Vitara", 2015, true, "Green", 230000, 3));
        cars.add(new Suzuki("Swift", 2010, true, "Green", 300000, 5));
        cars.add(new Mazda("cx5", 2019, true, "White", 70000, 2));
        cars.add(new Mazda("3", 2009, true, "White", 70000, 2));
        cars.add(new Haval("Jolian", 2023, true, "Silver", 10000, 1));
        cars.add(new Haval("M6", 2025, true, "Silver", 10000, 1));
        cars.add(new Dodge("Challenger", 2019, true, "Gray", 410000, 3));
        cars.add(new Dodge("Caravan", 2007, true, "Red", 500000, 9));


        System.out.println("=== After 2006 ===");
        carsAfter2006(cars);

        System.out.println("\n=== Change Color ===");
        changeColor(cars,"Black","White");
        cars.forEach(c -> System.out.println(c.getInfo()));

        System.out.println("\n=== Newest Car ===");
        printNewestCar(cars);
    }
}
