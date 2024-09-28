package second_module.interfaces;

public interface Info {
    void getInfo(); // You can add abstract specifier before "void", but it's not necessary
    abstract void getInfoAboutWeather();
    default void getRandomInfo() {
        System.out.println("I like cats.");
    }
}
