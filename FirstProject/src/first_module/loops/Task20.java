package first_module.loops;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        int times = 0;
        while (n != 0) {
            n = scanner.nextInt();
            times++;
        }
        times--;
        System.out.println(times);
    }
}
