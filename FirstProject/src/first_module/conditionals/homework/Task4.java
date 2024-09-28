package first_module.conditionals.homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short size = scanner.nextShort();
        if (size >= 159 && size <= 171) {
            System.out.println("S");
        } else if (size >= 172 && size <= 177) {
            System.out.println("M");
        } else if (size >= 178 && size <= 183) {
            System.out.println("L");
        } else if (size >= 184 && size <= 189){
            System.out.println("XL");
        }
    }
}
