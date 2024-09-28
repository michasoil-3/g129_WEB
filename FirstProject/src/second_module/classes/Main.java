package second_module.classes;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "red");
        Car car2 = new Car("Audi", "blue");
        Human human1 = new Human("Rem", "Demouvi", false, 190, 80, car1);
        Human human2 = new Human("Joey", "Jarvis", true, 186, 78.3, car2);
        Human human3 = new Human("James", "Jensen");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        human2.say("I like the toes that " + human3.name + " has.");
    }
}
