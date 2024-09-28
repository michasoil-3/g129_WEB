package first_module.arrays;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte size = scanner.nextByte();
        int[] numbers = new int[size];
        boolean found = false;
        byte indexOfFound = -1;

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int requested = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (numbers[i] == requested) {
                found = true;
                indexOfFound = (byte) i;
            }
        }
        if (found)
            System.out.println("YES\n" + indexOfFound);
        else
            System.out.println("NO");
    }
}
