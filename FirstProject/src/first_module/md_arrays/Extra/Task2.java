/*
Напишите программу которая выводит значения от 1 до 100 в виде змейки.
Используйте двумерный массив.
1 2 3 4 5 6 7 8 9 10
20 19 18 17 16 15 14 13 12 11
 */

package first_module.md_arrays.Extra;

public class Task2 {
    public static void main(String[] args) {
        final int upTo = 10;
        int[][] arr = new int[upTo][upTo];
        for (int i = 0; i < upTo; i++) {
            for (int j = 0; j < upTo; j++) {
                arr[i][i % 2 == 0 ? j : upTo-j-1] = (upTo * i) + j + 1;
            }
        }

        // Printing out array
        for (int[] subArr : arr) {
            for (int i: subArr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
