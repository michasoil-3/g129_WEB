package first_module.arrays;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int sum = 0;
        byte amountOfEvens = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                amountOfEvens++;
            }
        }
        System.out.println((double) sum / amountOfEvens);
    }
}
