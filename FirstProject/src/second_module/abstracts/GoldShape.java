package second_module.abstracts;

abstract class GoldShape {
    abstract double getVolume();

    public double getPrice() {
        return this.getVolume() * 250 + 1200;
    }
}
