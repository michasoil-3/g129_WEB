package first_module.strings;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (char c: line.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                System.out.print(Character.toString(c).toLowerCase());
            } else if (c >= 'a' && c <= 'z') {
                System.out.print(Character.toString(c).toUpperCase());
            } else {
                System.out.print(c);
            }

        }
    }
}
