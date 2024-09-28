package first_module.strings;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String newString = "";
        for (String substr: string.split(" ")) {
            String cutout = substr.toLowerCase();
            switch (cutout) {
                case "one":
                    newString += "1";
                    break;
                case "two":
                    newString += "2";
                    break;
                case "three":
                    newString += "3";
                    break;
                case "four":
                    newString += "4";
                    break;
                case "five":
                    newString += "5";
                    break;
                case "six":
                    newString += "6";
                    break;
                case "seven":
                    newString += "7";
                    break;
                case "eight":
                    newString += "8";
                    break;
                case "nine":
                    newString += "9";
                    break;
                case "zero":
                    newString += "0";
                    break;
                default:
                    newString += cutout;
                    break;
            }
            newString += " ";
        }
        System.out.println(newString);
    }
}
