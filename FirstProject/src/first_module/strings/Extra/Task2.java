/*
2. Условие задачи: Поиск наиболее часто встречающегося слова в строке

Напишите программу на Java, которая принимает строку от пользователя и находит наиболее часто встречающееся слово в этой строке. Считаем, что слова разделены пробелами, и игнорируем знаки препинания и регистр букв.

Пример:

Введите строку: "java is a programming language java is versatile and java is widely used"
Результат: Наиболее часто встречающееся слово: "java" (повторяется 3 раза)

Введите строку: "hello world hello world"
Результат: Наиболее часто встречающееся слово: "hello" (повторяется 2 раза)
 */

package first_module.strings.Extra;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");

        int times = -1;
        String mostAppearingWord = words[0];

        for (String word: words)
            set.add(word);

        for (String selectedWord: set) {
            int count = 0;
            for (String word: words) {
                if (word.equals(selectedWord))
                    count++;
            }
            if (count > times) {
                times = count;
                mostAppearingWord = selectedWord;
            }
        }

        System.out.println("The most appearing word is \"" + mostAppearingWord + "\" with an appearance count of " + times);

    }
}
