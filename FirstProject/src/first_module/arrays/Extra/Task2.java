/*
Напишите программу на Java, которая находит все пары чисел в заданном одномерном массиве, сумма которых равна заданному числу.
Программа должна запрашивать у пользователя размер массива и элементы массива, а также заданное число для нахождения пар.
В результате работы программы должны быть выведены все пары чисел, сумма которых равна заданному числу.

Например:
Введите размер массива: 5
Введите элементы массива: 2 7 4 1 6
Введите число для нахождения пар: 8

Найдены следующие пары чисел, сумма которых равна 8:
2 + 6 = 8
1 + 7 = 8
 */

package first_module.arrays.Extra;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte size;
        System.out.print("Enter array size: ");
        size = scanner.nextByte();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Which value are you looking for? ");
        int target = scanner.nextInt();

        // Searching for pairs
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==j)
                    continue;
                if (array[i] + array[j] == target &&  j < i) {
                    System.out.println(array[j] + " + " + array[i] + " = " + target);
                }
            }
        }
    }
}
