/*
Написать программу на Java, которая заполняет одномерный массив случайными числами от 1 до 100;
Длина массива 10;

Заполнение массива рандомными числами:
for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }

Пользователь должен иметь возможность выбрать, какое действие он хочет выполнить, введя соответствующую цифру. Например:

1. Выводит на экран все элементы массива в обратном порядке.
2. Находит сумму всех элементов массива и выводит ее на экран.
3. Находит среднее арифметическое всех элементов массива и выводит его на экран.
4. Находит наименьший элемент массива и выводит его на экран.
5. Находит наибольший элемент массива и выводит его на экран.
6. Сортирует массив по возрастанию и выводит его значения на экран .
7. Сортирует массив по убыванию и выводитего значения на экран.
8. Выход из программы

После выполнения выбранного действия, программа должна снова выводить меню с выбором действия.
Пользователь может выбирать и выполнять действия неограниченное количество раз, пока не выберет пункт "Выход из программы".
 */

package first_module.arrays.Extra;

import java.lang.Math;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Declarations
        byte decision = 0;
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        // Filling array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 100) + 1);
        }

        // Main loop
        do {
            System.out.println("What do you wish to do?\n");
            System.out.println("1. Show the array in reverse order");
            System.out.println("2. Show sum of all values in the array");
            System.out.println("3. Find the arithmetic mean of all values in the array");
            System.out.println("4. Find the minimum value of all values in the array");
            System.out.println("5. Find the maximum value of all values in the array");
            System.out.println("6. Sort the array in ascending order and show it");
            System.out.println("7. Sort the array in descending order and show it");
            System.out.println("8. Exit");
            decision = scanner.nextByte();

            switch (decision) {
                case 1:
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + ", ");
                    }
                    System.out.println("STOP");
                    break;

                case 2: {
                    int sum = 0;
                    for (int i : arr) {
                        sum += i;
                    }
                    System.out.println("Sum: " + sum);
                }
                break;
                case 3: {
                    int sum = 0;
                    for (int i : arr) {
                        sum += i;
                    }
                    System.out.println("Arithmetic mean: " + (sum / (double) arr.length));
                }
                    break;
                case 4: {
                    int min = Integer.MAX_VALUE;
                    for (int i : arr) {
                        if (i < min) min = i;
                    }
                    System.out.println("Minimum value: " + min);
                    }
                    break;
                case 5: {
                    int max = Integer.MIN_VALUE;
                    for (int i : arr) {
                        if (i > max) max = i;
                    }
                    System.out.println("Maximum value: " + max);
                    }
                    break;
                case 6: {
                    // Sorting
                    int temp;
                    for (int i = 0; i < arr.length-1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    // Output
                    for (int element: arr) {
                        System.out.print(element + ", ");
                    }
                    System.out.println("STOP");
                    }
                    break;
                case 7: {
                    // Sorting
                    int temp;
                    for (int i = 0; i < arr.length-1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] < arr[j + 1]) {
                                temp = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = temp;
                            }
                        }
                    }
                    // Output
                    for (int element: arr) {
                        System.out.print(element + ", ");
                    }
                    System.out.println("STOP");
                }
                break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid value.");
                    break;
            }
        } while (decision != 8);
    }
}
