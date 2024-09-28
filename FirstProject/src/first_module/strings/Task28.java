package first_module.strings;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] lines = string.split(" ");
        for (String l: lines) {
            for (int i = l.length() - 1; i >= 0; i--) {
                System.out.print(l.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
