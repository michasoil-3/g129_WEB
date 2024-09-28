package first_module.types.homework;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tens = number / 10;
        int units = number % 10;
        System.out.println(tens);
        System.out.println(units);
    }
}
