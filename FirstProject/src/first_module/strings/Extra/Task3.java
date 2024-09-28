/*
3. Задача: Напишите программу на Java, которая принимает входную строку и подсчитывает количество гласных и согласных букв в ней.

Пример:
Входная строка: "Hello, World!"
Результат:

Количество гласных: 3 (e, o, o)
Количество согласных: 7 (H, l, l, W, r, l, d)
 */

package first_module.strings.Extra;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int vowelCount = 0, consonantCount = 0;

        for (char c: line.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (vowels.indexOf(c) == -1)
                    consonantCount++;
                else
                    vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount + "\nConsonants: " + consonantCount);
    }
}
