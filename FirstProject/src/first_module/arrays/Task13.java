package first_module.arrays;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int sum = 0;
        byte amountOfNegatives = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                sum += numbers[i];
                amountOfNegatives++;
            }
        }
        System.out.println((float) sum / amountOfNegatives);
    }
}
