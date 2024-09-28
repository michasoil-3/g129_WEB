package first_module.arrays;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int maximum = Integer.MIN_VALUE;
        byte maximumIndex = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > maximum) {
                maximum = numbers[i];
                maximumIndex = (byte) i;
            }
        }
        System.out.println(maximum + " " + maximumIndex);
    }
}
