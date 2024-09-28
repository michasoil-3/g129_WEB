package second_module.generics;

public class Main {
    public static void main(String[] args) {
        Container<Integer> container1 = new Container<>(2);
        container1.setT(203);
        Container<String> container2 = new Container<>("hello");
        Container container3 = new Container<>("world"); // No type mandation (generic)
        container3.setT(193);
        System.out.println(container1.getT());
        System.out.println(container2.getT());
        System.out.println(container3.getT());

    }
}
