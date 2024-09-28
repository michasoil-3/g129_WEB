package second_module.interfaces;

public class Someone implements Info {
    public String name;

    public Someone() {
        this.name = "Joey";
    }

    public Someone(String name) {
        this.name = name;
    }

    @Override
    public void getInfo() {
        System.out.println("Hello from " + this.name + "!");
    }

    @Override
    public void getInfoAboutWeather() {
        System.out.println("The weather is really nice today, says " + this.name + "!");
    }
}
