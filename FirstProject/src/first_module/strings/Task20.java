package first_module.strings;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] elements = line.split(" ");
        int number1 = Integer.parseInt(elements[0]);
        char operand = elements[1].charAt(0);
        int number2 = Integer.parseInt(elements[2]);
        switch (operand) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;

        }
    }
}
