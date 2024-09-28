package second_module.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            try {
                int input = scanner.nextInt();
                arr[i] = input;
            } catch (InputMismatchException e) {
                arr[i] = 0;
                scanner.next();
            }

        }
        for (int i: arr) {
            System.out.print((i * i) + " ");
        }
    }
}
