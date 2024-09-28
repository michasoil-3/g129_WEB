package first_module.md_arrays;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int replacer = scanner.nextInt();
        int[][] arr = new int[replacer][replacer];
        for (int i = 0; i < replacer; i++) {
            for (int j = 0; j < replacer; j++) {
                if (i == 0)
                    arr[replacer-1][j] = scanner.nextInt();
                else if (i == replacer-1)
                    arr[0][j] = scanner.nextInt();
                else
                    arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < replacer; i++) {
            for (int j = 0; j < replacer; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
