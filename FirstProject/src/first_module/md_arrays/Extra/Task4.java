/*
Найти максимальный элемент в каждой строке двумерного массива
и заменить его на сумму всех остальных элементов в этой же строкe.
Заполнить масссив рандомными числами до 100.
 */

package first_module.md_arrays.Extra;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        final int rows = random.nextInt(5) + 5;
        final int columns = random.nextInt(5) + 5;
        int[][] array = new int[rows][columns];

        // Assigning random values
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                array[i][j] = random.nextInt(100) + 1;

        // Outputting
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

        // Setting the maximum value of each row to the sum of the values in said row
        int max, maxIndex = 0, sum;
        for (int i = 0; i < rows; i++) {
            max = Integer.MIN_VALUE;
            sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxIndex = j;
                }
            }
            array[i][maxIndex] = sum - max;
        }

        System.out.println("\nAFTER MODIFICATION:");
        // Outputting (again)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

