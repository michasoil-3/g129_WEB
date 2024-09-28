package first_module.loops;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        int n = 1;
        while (n != 0) {
            n = scanner.nextInt();
            sum += n;
            count++;
        }
        count--;
        System.out.println((double) n / sum);
    }
}
