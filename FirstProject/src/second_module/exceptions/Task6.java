package second_module.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        do {
            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Sum of numbers: " + (a + b));
                stop = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid data entered. Try again");
                scanner.next();


            }
        } while (!stop);
    }
}