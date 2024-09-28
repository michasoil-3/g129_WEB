package second_module.classes;

public class Human {
    String name;
    String surname;
    boolean gender;
    double heightCm;
    double weightG;
    Car car;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.gender = false;
        this.heightCm = 170;
        this.weightG = 70;
    }
    public Human(String name, String surname, boolean gender, double heightCm, double weightG, Car car) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.heightCm = heightCm;
        this.weightG = weightG;
        this.car = car;
    }

    public void say(String phrase) {
        System.out.println(this.name + " says: " + phrase);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", heightCm=" + heightCm +
                ", weightG=" + weightG +
                ", car=" + car +
                '}';
    }
}
