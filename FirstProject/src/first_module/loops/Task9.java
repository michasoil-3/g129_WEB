package first_module.loops;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % 2 == 0)
            n++;

        for (int i = n; i<=m; i+=2) {
            System.out.print(i + " ");
        }
    }
}
