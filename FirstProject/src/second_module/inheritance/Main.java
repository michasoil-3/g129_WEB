package second_module.inheritance;

public class Main {
    public static void main(String[] args) {
        Human empty = new Human();
        Man man = new Man("Jenson", "Presvett", 26, 85, true);
        Woman woman = new Woman("Floren", "Presvett", 23, 68, false);
        System.out.println(empty);
        System.out.println(man);
        System.out.println(woman);

        Human[] humans = {empty, man, woman}; /// polymorphism: man and woman aren't Human objects but are children
        for (Human human: humans)
            human.getInfo();
    }
}
