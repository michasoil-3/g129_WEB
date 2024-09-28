package second_module.abstracts;

public class FerrariEngine extends Engine {

    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    double efficiency() {
        return 0.25;
    }

    @Override
    double throttleEnergy() {
        return this.getEngineVolume() * this.getCylinderAmount() * 100;
    }

    @Override
    double breakEnergy() {
        return this.getEngineWeight() * 2;
    }
}
