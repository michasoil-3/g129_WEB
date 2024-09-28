package first_module.strings;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filtered = "";
        boolean isFiltering = false;
        String line = scanner.nextLine();
        for (char c: line.toCharArray()) {
            if (c == '<') {
                isFiltering = true;
            }
            else if (c == '>') {
                isFiltering = false;
                filtered += " ";
            } else {
                if (isFiltering && c != ' ')
                    filtered += c;
            }
        }
        System.out.println(filtered);
    }
}
