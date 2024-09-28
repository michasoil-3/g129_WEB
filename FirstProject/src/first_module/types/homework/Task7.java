package first_module.types.homework;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int V = a * b * c;
        int S = 2 * ((a * b) + (b * c) + (a * c));
        System.out.println(V + " " + S);
    }
}
