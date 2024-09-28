package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        HashSet<String> hs = new HashSet<>();
        do {
            input = in.next();
            hs.add(input);
        } while (!(input.equals("stop")));
        int sum = -4;
        for (String s: hs) {
            sum += s.length();
        }
        System.out.println(sum);
    }
}
