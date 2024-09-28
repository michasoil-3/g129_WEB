package first_module.arrays;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < minimum)
                minimum = numbers[i];
        }
        System.out.println(minimum * minimum);
    }
}
