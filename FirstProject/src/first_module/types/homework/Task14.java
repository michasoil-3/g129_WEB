package first_module.types.homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int products = scanner.nextInt();
        System.out.println((int) (0.05 * (products * 5000)));
    }
}
