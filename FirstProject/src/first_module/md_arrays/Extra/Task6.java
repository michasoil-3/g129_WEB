/*
Дан двумерный массив целых чисел размером N x M. Необходимо найти сумму элементов массива,
которые являются простыми числами, и вывести ее на экран.
простое число делится без остатка только на 1 и на само себя.
Примеры простых чисел: 2, 3, 5, 7, 11, 13, 17, 19, 23, и так далее.
 */

package first_module.md_arrays.Extra;

import java.util.Random;
import java.lang.Math;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int sumPrimes = 0;
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

        // Getting sum of every prime
        boolean isPrime;
        for (int[] row: array)
            for (int number: row) {
                if (number == 2) {
                    sumPrimes += number;
                    continue;
                }

                if (number == 1 || number % 2 == 0)
                    continue;

                isPrime = true;
                for (int i = 3; i <= (int) Math.sqrt(number); i += 2) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    sumPrimes += number;
            }

        // Output
        System.out.println("Sum of primes: " + sumPrimes);
    }
}
