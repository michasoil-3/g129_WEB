package first_module.md_arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int row = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print(arr[row][i] + " ");
        }

    }
}