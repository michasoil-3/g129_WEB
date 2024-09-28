package first_module.strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char character = scanner.next().charAt(0);
        int value = string.indexOf(character);
        if (value == -1) {
            System.out.println("THERE IS NO SUCH LETTER");
        } else {
            System.out.println(value);
        }
    }
}
