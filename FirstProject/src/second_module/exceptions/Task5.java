package second_module.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            try {
                int input = scanner.nextInt();
                arr[i] = input;
                sum += input;
            } catch (InputMismatchException e) {
                arr[i] = 0;
                scanner.next();
            }

        }
        System.out.println(sum);
    }
}
