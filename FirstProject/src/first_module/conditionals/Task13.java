package first_module.conditionals;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 100 && a < 200) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
