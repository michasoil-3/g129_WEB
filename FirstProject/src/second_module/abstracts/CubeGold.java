package second_module.abstracts;

public class CubeGold extends GoldShape {
    private double side;

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getVolume() {
        return this.side * this.side * this.side;
    }
}
