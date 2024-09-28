package second_module.abstracts;

public class Cow extends Animal {
    boolean horns;

    public Cow() {
    }

    public Cow(double weight, int age, boolean gender, boolean horns) {
        super(weight, age, gender);
        this.horns = horns;
    }

    public boolean isHorns() {
        return horns;
    }

    public void setHorns(boolean horns) {
        this.horns = horns;
    }

    @Override
    int getPriceForOnePack() {
        return 300;
    }
}
