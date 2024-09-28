package first_module.md_arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensionX = scanner.nextInt();
        int[][] arr = new int[2][dimensionX];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < dimensionX; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < dimensionX; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
