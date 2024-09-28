package first_module.conditionals.homework;

import java.util.Scanner;
import java.lang.Math;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = scanner.nextByte();
        byte b = scanner.nextByte();
        byte c = scanner.nextByte();
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println((max / 10) + (max % 10) + (min / 10) + min % 10);
    }
}
