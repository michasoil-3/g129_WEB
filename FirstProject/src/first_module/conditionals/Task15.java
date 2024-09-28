package first_module.conditionals;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int diff;
        if (a > b) {
            diff = a - b;
        } else {
            diff = b - a;
        }
        if (diff >= 100){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
