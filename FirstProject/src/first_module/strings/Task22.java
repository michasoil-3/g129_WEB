package first_module.strings;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (char c: line.toCharArray()) {
            if (c >= '0' && c <= '9') {
                System.out.print('0');
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
