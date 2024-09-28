package first_module.conditionals;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a-b == 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
