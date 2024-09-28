package second_module.abstracts;

public abstract class Animal {
    protected double weight;
    protected int age;
    protected boolean gender;

    public Animal() {

    }

    public Animal(double weight, int age, boolean gender) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    int getPriceForOnePack() {
        return 1;
    }
}

