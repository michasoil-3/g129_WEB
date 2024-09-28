package first_module.strings;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        final String numbers = "0123456789";
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int sum = 0;
        for (char c: line.toCharArray()) {
            if (numbers.contains(Character.toString(c))) {
                sum += numbers.indexOf(c);
            }
        }
        System.out.println(sum);
    }
}
