package first_module.loops;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long product = 1;
        for (int i = 0; i < n; i++) {
            product *= (i+1);
        };
        System.out.println(product);
    }
}
