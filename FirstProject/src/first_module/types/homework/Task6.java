package first_module.types.homework;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((x * x * x) + (5 * x * y) - (6 * z * y) + (z * z * z));
    }
}
