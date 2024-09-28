package first_module.arrays;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int product = 1;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] != 0 && i % 2 == 0)
                product *= numbers[i];
        }
        System.out.println(product);
    }
}
