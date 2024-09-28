package first_module.strings;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.print(string.charAt(1));
        System.out.println((((int)string.charAt(0)) * 2) - 96);
    }
}
