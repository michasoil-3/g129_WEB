package first_module.md_arrays;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        byte m = scanner.nextByte();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minI = 0, minJ = 0, maxI = 0, maxJ = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        arr[minI][minJ] = max;
        arr[maxI][maxJ] = min;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
