package first_module.strings;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String major = scanner.nextLine();
        String minor = scanner.nextLine();
        System.out.println(major.contains(minor) ? "Yes" : "No");
    }
}
