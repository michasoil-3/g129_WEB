package first_module.arrays;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 1; i < size; i+=2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
