package first_module.conditionals;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte year = scanner.nextByte();
        if (year >= 10) {
            System.out.println("High School");
        } else if (year >= 5) {
            System.out.println("Middle School");
        } else {
            System.out.println("Beginners School");
        }
    }
}
