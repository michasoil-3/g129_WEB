package second_module.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            int a = in.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Program ended.");
    }
}
