package first_module.arrays;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        int compareTo;
        int sum = 0, numbersToCompare = 0;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        compareTo = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] > compareTo) {
                sum += numbers[i];
                numbersToCompare++;
            }
        }
        System.out.println((float) sum / numbersToCompare);
    }
}
