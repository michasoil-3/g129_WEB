package first_module.loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n);
        for (int i = 0; i < 9; i++) {
            System.out.print(" " + n);
        }
    }
}
