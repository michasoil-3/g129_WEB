package first_module.loops;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int times = scanner.nextInt();

        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
}
