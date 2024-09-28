package first_module.strings;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        System.out.println(string1.equalsIgnoreCase(string2) ? "THEY ARE EQUAL" : "THEY ARE NOT EQUAL");
    }
}
