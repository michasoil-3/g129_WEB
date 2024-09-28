package first_module.loops;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int total = 0;
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                total++;
            }
        }
        System.out.println(total);
    }
}
