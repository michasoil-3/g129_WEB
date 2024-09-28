package first_module.strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(string.equalsIgnoreCase("JAVA") ? "YES" : "NO");
    }
}
