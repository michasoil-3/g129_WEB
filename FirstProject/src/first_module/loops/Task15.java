package first_module.loops;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        if (n % 2 == 1) n++;
        for (int i = n; i <= m; i+=2)
            sum += i;
        System.out.println(sum);

    }
}
