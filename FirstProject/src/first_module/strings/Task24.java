package first_module.strings;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] lines = line.split(" ");
        for (String l : lines) {
            for (int i = 0; i < l.length(); i++) {
                if (i == 0) {
                    System.out.print(Character.toUpperCase(l.charAt(0)));
                } else {
                    System.out.print(Character.toLowerCase(l.charAt(i)));
                }
            }
            System.out.print(" ");
        }
    }
}
