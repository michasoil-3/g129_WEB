package second_module.abstracts;

import java.math.BigDecimal;

public class SphereGold extends GoldShape {
    private double radius;

    public SphereGold() {
    }

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (double) 4 / 3 * 3.14 * this.radius * this.radius * this.radius;
    }
}
