package second_module.abstracts;

public class RenaultEngine extends Engine {
    private double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    double efficiency() {
        return 0.27;
    }

    @Override
    double throttleEnergy() {
        return this.getEngineVolume()*this.getCylinderAmount()*110 + this.extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return this.getEngineWeight() * 2.1;
    }
}
