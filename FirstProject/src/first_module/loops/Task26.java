package first_module.loops;

import java.util.Scanner;
import java.lang.Math;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int sum = 0;
        while (n != 0) {
            n = scanner.nextInt();
            if (Math.abs(n) % 2 != 0) sum += n;
        }
        System.out.println(sum);
    }
}
