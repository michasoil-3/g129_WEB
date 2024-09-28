package first_module.strings;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.length() != string2.length()) {
            System.out.println("No");
        } else {
            boolean hasBroken = false;
            for (int i = 0; i < string1.length(); i++) {
                if (string1.charAt(i) != string2.charAt(string2.length() - i - 1)) {
                    hasBroken = true;
                    break;
                }
            }
            if (!hasBroken) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
