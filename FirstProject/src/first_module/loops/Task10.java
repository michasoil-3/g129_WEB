package first_module.loops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % 3 != 0)
            n += (3 - (n%3));

        for (int i = n; i<=m; i+=3) {
            System.out.print(i + " ");
        }
    }
}
