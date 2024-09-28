package first_module.types.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, surname, country;
        byte age;

        name = scanner.next();
        surname = scanner.next();
        age = scanner.nextByte();
        country = scanner.next();
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}
