package first_module.arrays;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        boolean tracking = false;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (tracking)
                sum += numbers[i];
            if (numbers[i] == 0)
                tracking = !tracking;
        }
        System.out.println(sum);
    }
}
