package first_module.arrays;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        final double average = (double) sum / size;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > average) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
