package first_module.arrays;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int indexOfMin = 0;
        int indexofMax = 0;
        int temp;
        int sum = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > maximum) {
                maximum = numbers[i];
                indexofMax = i;
            }
            if (minimum > numbers[i]) {
                minimum = numbers[i];
                indexOfMin = i;
            }
        }
        temp = minimum;
        numbers[indexOfMin] = maximum;
        numbers[indexofMax] = temp;
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
