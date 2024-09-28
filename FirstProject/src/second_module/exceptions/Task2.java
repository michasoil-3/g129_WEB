package second_module.exceptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
