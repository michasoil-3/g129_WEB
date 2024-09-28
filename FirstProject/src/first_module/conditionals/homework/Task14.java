package first_module.conditionals.homework;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short year = scanner.nextShort();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(366);
        } else {
            System.out.println(365);
        }
    }
}
