package first_module.conditionals.homework;

import java.util.Scanner;
import java.lang.Math;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a != b && a != c && a != d) {
            System.out.println(1);
        } else if (b != c && b != d && b != a) {
            System.out.println(2);
        } else if (c != a && c != b && c != d) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
