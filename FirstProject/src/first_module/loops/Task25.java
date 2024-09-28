package first_module.loops;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = 1;
        double product = 1;
        while (n != 0) {
            n = scanner.nextDouble();
            if (n != 0)
                product *= n;
        }
        System.out.println((float) product);
    }
}