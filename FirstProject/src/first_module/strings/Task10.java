package first_module.strings;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        for (float i = 0F; i < word.length(); i+=0.5F) {
            System.out.print(word.charAt((int) i));
        }
    }
}
