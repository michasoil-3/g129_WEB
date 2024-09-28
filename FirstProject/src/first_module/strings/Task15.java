package first_module.strings;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String vowels = "aeiouAEIOU";
        int vowelsinLine = 0;
        for (int i = 0; i < line.length(); i++) {
            if (vowels.contains(Character.toString(line.charAt(i))))
                vowelsinLine++;
        }
        System.out.println(vowelsinLine);
    }
}
