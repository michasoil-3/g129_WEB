package first_module.types;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rubles = scanner.nextFloat();
        float exchangeRate = 6;
        System.out.println((int) (rubles * exchangeRate));
    }
}
