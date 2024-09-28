/*
Вывести сумму чисел по главной диагонали
размер массива 4x4
Random random = new Random();
for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

заполните рандомными числами
 */

package first_module.md_arrays.Extra;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        final int size = 4;
        int[][] arr = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i][i];
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
