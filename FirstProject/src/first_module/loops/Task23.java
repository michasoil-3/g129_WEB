package first_module.loops;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = 1;
        while (n != 0) {
            n = scanner.nextInt();
            if (n > max)
                max = n;
        }

        System.out.println(max);
    }
}
