package second_module.inheritance;

public class Woman extends Human{
    private boolean paintedNails;

    public Woman(){
        super();
        this.paintedNails = false;
    }

    public Woman(String name, String surname, int age, double weight, boolean paintedNails) {
        super(name, surname, age, weight);
        this.paintedNails = paintedNails;
    }

    public boolean isPaintedNails() {
        return paintedNails;
    }

    public void setPaintedNails(boolean paintedNails) {
        this.paintedNails = paintedNails;
    }

    @Override
    public void getInfo() {
        System.out.println("My name is " + this.name + ", and I am a woman.");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", paintedNails=" + paintedNails +
                '}';
    }
}
