package second_module.inheritance;

public class Man extends Human {
    private boolean education;

    public Man() {
        super();
        this.education = false;
    }

    public Man(String name, String surname, int age, double weight, boolean education) {
        super(name, surname, age, weight);
        this.education = education;
    }

    public boolean isEducation() {
        return education;
    }

    public void setEducation(boolean education) {
        this.education = education;
    }

    @Override
    public void getInfo() {
        System.out.println("My name is " + this.name + ", and I am a man.");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", education=" + education +
                '}';
    }
}
