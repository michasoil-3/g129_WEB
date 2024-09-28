package first_module.strings;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String full = scanner.nextLine();
        String[] cutouts = full.split(" ");
        String operator1 = cutouts[1];
        String operator2 = cutouts[3];
        int term1 = Integer.parseInt(cutouts[0]);
        int term2 = Integer.parseInt(cutouts[2]);
        int term3 = Integer.parseInt(cutouts[4]);
        int result = 0;

        if ((operator2.equals("*") || operator2.equals("/")) && (operator1.equals("+") || operator1.equals("-"))) {
            if (operator2.equals("*"))
                result += term2 * term3;
            else
                result += term2 / term3;

            if (operator1.equals("+"))
                result += term1;
            else
                result = term1 - result;
        }
        else if ((operator1.equals("*") || operator1.equals("/")) && (operator2.equals("+") || operator2.equals("-"))) {
            if (operator1.equals("*"))
                result += term1 * term2;
            else
                result += term1 / term2;

            if (operator2.equals("+"))
                result += term3;
            else
                result -= term3;
        }
        else {
            switch (operator1) {
                case "+":
                    result += term1 + term2;
                    break;
                case "-":
                    result += term1 - term2;
                    break;
                case "*":
                    result += term1 * term2;
                    break;
                case "/":
                    result += term1 / term2;
                    break;
            }
            switch (operator2) {
                case "+":
                    result += term3;
                    break;
                case "-":
                    result -= term3;
                    break;
                case "*":
                    result *= term3;
                    break;
                case "/":
                    result /= term3;
                    break;
            }
        }
        System.out.println(result);
    }
}
