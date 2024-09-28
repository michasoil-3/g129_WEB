/*
1. Условие задачи: Подсчет количества слов в строке

Напишите программу на Java, которая принимает строку от пользователя и выводит количество слов в этой строке. Считается, что слова разделены пробелами.

Пример:

Введите строку: Hello, world! This is a sample string.
Количество слов в строке: 7
 */

package first_module.strings.Extra;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        System.out.println("Words in line: " + (line.isEmpty() ? 0 : line.split((" ")).length));
    }
}
