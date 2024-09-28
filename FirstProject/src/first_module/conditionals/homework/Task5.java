package first_module.conditionals.homework;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
