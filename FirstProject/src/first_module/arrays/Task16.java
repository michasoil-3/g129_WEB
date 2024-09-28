package first_module.arrays;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int divisor = scanner.nextInt();
        for (int number : numbers) {
            if (number % divisor == 0)
                System.out.print(number + " ");
        }
    }
}
