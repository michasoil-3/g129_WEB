package first_module.arrays;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        boolean expectPositive = false;
        boolean patternFollowed = true;

        numbers[0] = scanner.nextInt();
        if (numbers[0] < 0)
            expectPositive = true;

        for (int i = 1; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if ((numbers[i] > 0 && !expectPositive) || (numbers[i] < 0 && expectPositive)) {
                patternFollowed = false;
                break;
            }
            expectPositive = !expectPositive;
        }
        System.out.println(patternFollowed ? "YES" : "NO");
    }
}
