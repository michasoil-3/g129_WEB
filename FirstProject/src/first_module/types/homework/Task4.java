package first_module.types.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(4 * (x - 3) - (7 * (x - 3)) + 2);
    }
}
