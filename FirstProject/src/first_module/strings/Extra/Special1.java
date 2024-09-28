package first_module.strings.Extra;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Special1 {
    public static void main(String[] args) {
        // The code below outputs a string without repeating chars.

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String lineRedacted = "";
        Set<Character> usedChars = new HashSet<>();

        for (char c: line.toCharArray()) {
            if (!usedChars.contains(c)) {
                usedChars.add(c);
                lineRedacted += c;
            }
        }
        System.out.println(lineRedacted);
    }
}
