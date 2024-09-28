package first_module.conditionals.homework;

import java.util.Scanner;
import java.lang.Math;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte bx = scanner.nextByte();
        byte by = scanner.nextByte();
        byte fx = scanner.nextByte();
        byte fy = scanner.nextByte();
        if (Math.abs(fx - bx) == Math.abs(fy - by)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
