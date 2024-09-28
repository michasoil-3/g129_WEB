/*
Написать программу, которая находит среднее арифметическое всех элементов двумерного массива
и заменяет все элементы, которые больше среднего арифметического, на значение 1,
а все элементы, которые меньше среднего арифметического, на значение 0.
 */

package first_module.md_arrays.Extra;

import java.util.Random;

public class Task5 {
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

        // Calculating average and replacing
        int sum, average;
        for (int i = 0; i < rows; i++) {
            sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
            average = sum / columns;
            for (int j = 0; j < columns; j++) {
                if (array[i][j] > average)
                    array[i][j] = 1;
                else
                    array[i][j] = 0;
            }
        }

        // Outputting
        System.out.println("\nAFTER MODIFICATION");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
