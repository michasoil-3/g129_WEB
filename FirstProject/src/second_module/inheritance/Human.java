package second_module.inheritance;

public class Human {
    protected String name;
    protected String surname;
    protected int age;
    protected double weight;

    public Human() {
        this.name = "Unnamed";
        this.surname = "Unnamed";
        this.age = -1;
        this.weight = -1;
    }

    public Human(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getInfo() {
        System.out.println("My name is " + this.name + ", and they don't know my gender.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
