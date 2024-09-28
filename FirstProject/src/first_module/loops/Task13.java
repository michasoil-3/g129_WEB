package first_module.loops;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int counter=0;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
