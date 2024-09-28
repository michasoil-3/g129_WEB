package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task16 {
    public static void main(String[] args) {
        String vowels = "aeiou";
        Scanner in = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        String input;
        int sum = -1;
        do {
            input = in.next().toLowerCase();
            hs.add(input);

        } while (!(input.equals("stop")));
        for (String s: hs) {
            for (char c: s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
