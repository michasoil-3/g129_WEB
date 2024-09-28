package first_module.loops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= (n/2); i++) {
            System.out.print((i*2) + " ");
        }
    }
}
