package first_module.arrays;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int numberOfEvens = 0;
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0)
                numberOfEvens++;
        }
        int[] evens = new int[numberOfEvens];
        int mainCounter = 0;
        int i = 0;
        do {
            if (numbers[mainCounter] % 2 == 0) {
                evens[i] = numbers[mainCounter];
                i++;
            }
            mainCounter++;
        } while (mainCounter < numbers.length);

        for (int j = 0; j < evens.length; j++)
            System.out.print(evens[j] + " ");
    }
}
