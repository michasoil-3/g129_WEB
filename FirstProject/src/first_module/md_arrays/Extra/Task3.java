/*
Написать программу, которая проверяет, является ли заданный двумерный массив
"магическим квадратом" (сумма всех элементов в каждой строке, столбце и диагонали равна одному и тому же числу)
и выводит результат на экран.
Массив уже дан:  int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1},
        };
Магическая константа для квадрата порядка n
(т.е. квадрата, состоящего из n строк и n столбцов) вычисляется по следующей формуле:
int n = magicSquare.length;
int magicConstant = n * (n * n + 1) / 2
 */
package first_module.md_arrays.Extra;

public class Task3 {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1},
        };
        final int length = magicSquare.length;
        final int magicConstant = length * (length * length + 1) / 2;
        boolean isMagicSquare = true;

        int sum;
        // Checking horizontals
        for (int[] ints : magicSquare) {
            sum = 0;
            for (int j = 0; j < length; j++) {
                sum += ints[j];
            }
            if (sum != magicConstant)
                isMagicSquare = false;
        }

        // Checking verticals
        for (int i = 0; i < length; i++) {
            sum = 0;
            for (int[] ints : magicSquare) {
                sum += ints[i];
            }
            if (sum != magicConstant)
                isMagicSquare = false;
        }

        // Checking / diagonal
        sum = 0;
        for (int i = 0; i < length; i++) {
            sum += magicSquare[i][length-i-1];
        }
        if (sum != magicConstant)
            isMagicSquare = false;

        // Checking \ diagonal
        sum = 0;
        for (int i = 0; i < length; i++) {
            sum += magicSquare[length-i-1][i];
        }
        if (sum != magicConstant)
            isMagicSquare = false;

        if (isMagicSquare) {
            System.out.println("Magic square detected.");
        } else {
            System.out.println("No magic square detected.");
        }
    }
}
