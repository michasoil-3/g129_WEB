/*
Дан двумерный массив целых чисел размером N x M. Необходимо найти и вывести на экран сумму элементов в каждом столбце массива,
которые делятся на 3 без остатка.
 */

package first_module.md_arrays.Extra;

import java.util.Random;

public class Task7 {
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

        // Getting sums
        int sum;
        System.out.print("The sums of numbers not divisible by 3 in each row are: ");
        for (int[] row : array) {
            sum = 0;
            for (int number : row) {
                if (number % 3 != 0)
                    sum += number;
            }
            System.out.print(sum + ", ");
        }
        System.out.println();
    }
}
