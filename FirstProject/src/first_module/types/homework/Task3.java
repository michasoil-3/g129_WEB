package first_module.types.homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double diameter = scanner.nextDouble();
        System.out.println(pi * diameter);
    }
}
