package second_module.inheritance;

public class Toyota extends Car {
    private String manufacturer;

    public Toyota() {
        super();
        this.manufacturer = "None";
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String ride() {
        return "Toyota Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " +
                this.year + " year with engine volume " + this.volume + " liters manufactured from " + this.manufacturer +
                " is riding.";
    }
}
