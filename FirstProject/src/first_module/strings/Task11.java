package first_module.strings;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();
        char letter = scanner.next().charAt(0);
        int appearances = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter)
                appearances++;
        }

        System.out.println(appearances);
    }
}
