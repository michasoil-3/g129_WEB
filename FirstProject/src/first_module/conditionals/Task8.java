package first_module.conditionals;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 2019) {
            System.out.println("NO");
        } else if (n >= 2021) {
            System.out.println("YES");
        } else {
            System.out.println("ERROR");
        }
    }
}
