package first_module.conditionals.homework;

import java.util.Scanner;
import java.lang.Math;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        int diff3 = Math.abs(b - c);
        if (diff1 > diff2 && diff1 > diff3) {
            System.out.println(diff1);
        } else if (diff2 > diff1 && diff2 > diff3) {
            System.out.println(diff2);
        } else {
            System.out.println(diff3);
        }

    }
}
