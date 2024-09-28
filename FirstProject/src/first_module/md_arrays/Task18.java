package first_module.md_arrays;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        int max;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
            System.out.println(max);
        }
    }
}
