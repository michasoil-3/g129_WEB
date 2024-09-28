package first_module.types.homework;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        double L = scanner.nextDouble();
        double R = L / (2 * pi);
        double S = pi * R * R;
        System.out.println(R);
        System.out.println(S);
    }
}
