package first_module.conditionals;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 17 == 0) {
            System.out.println("DIVISIBLE BY 17");
        }
    }
}
