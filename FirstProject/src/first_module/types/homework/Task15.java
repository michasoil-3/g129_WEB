package first_module.types.homework;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number - (hundreds * 100)) / 10;
        int units = number - (hundreds * 100) - (tens * 10);
        System.out.println(units);
        System.out.println(tens);
    }
}
