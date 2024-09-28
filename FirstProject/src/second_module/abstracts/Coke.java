package second_module.abstracts;

public class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling;

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    double getCalories() {
        double toReturn = this.volumeLiters * 100;
        if (this.isSparkling)
            toReturn *= 4;
        return toReturn;
    }
}
