package second_module.stream_api;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Car1 {
    private String brand;
    private String model;
    private int year;

    public Car1() {
    }

    public Car1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static ArrayList<Car1> getCarsAfterYear(ArrayList<Car1> cars, int year) {
        return cars.stream().filter(s -> s.getYear() > year).collect(Collectors.toCollection(ArrayList::new));
    }
}
