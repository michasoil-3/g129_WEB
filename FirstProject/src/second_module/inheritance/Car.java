package second_module.inheritance;

public class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car() {
        this.name = "";
        this.model = "";
        this.maxSpeed = 0;
        this.year = -1;
        this.volume = -1;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String ride() {
        // "Car KIA RIO with max speed 220 km/h from 2012 year with engine volume 2.2 liters is riding."
        return "Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " +
                this.year + " year with engine volume " + this.volume + " liters is riding.";
    }
}
