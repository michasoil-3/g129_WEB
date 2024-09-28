package second_module.inheritance;

public class Mercedes extends Car {
    private String classType;

    public Mercedes() {
        super();
        this.classType = "M";
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public String ride() {
        return "Mercedes Car " + this.name + " " + this.model + " with max speed " + this.maxSpeed + " km/h from " +
                this.year + " year with engine volume " + this.volume + " liters with " + this.classType +
                " class is riding.";
    }
}
