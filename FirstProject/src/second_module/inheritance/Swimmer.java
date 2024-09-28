package second_module.inheritance;

public class Swimmer extends Sportsman {
    private String style;
    private double recordTime;

    public Swimmer() {
        super();
        this.style = "Unknown";
        this.recordTime = -1;
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String play() {
        return "Swimmer " + this.fullName + " from " + this.country + ", " + this.age + " years old with " +
                this.style + " style swam in " + this.recordTime + " seconds.";
    }
}
