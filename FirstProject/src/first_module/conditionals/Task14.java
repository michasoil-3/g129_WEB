package first_module.conditionals;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}