package first_module.types;

import java.util.Scanner;

public class Inp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        String d = scanner.next();
        System.out.println("You have entered the following (concatenated): " + a + b + c);
        System.out.println(d);
    }
}
