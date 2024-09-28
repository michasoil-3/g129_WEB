package first_module.arrays;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
            sum += numbers[i];
        }
        System.out.println(sum - maximum - minimum);
        System.out.println((double) (sum - maximum - minimum)/(size - 2));
    }
}
