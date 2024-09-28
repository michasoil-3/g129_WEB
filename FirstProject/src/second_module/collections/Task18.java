package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        String input;
        do {
            input = in.next();
            if (!input.equals("exit"))
                hs1.add(input);
        } while (!input.equals("exit"));
        do {
            input = in.next();
            if (!input.equals("exit"))
                hs2.add(input);
        } while (!input.equals("exit"));
        hs1.addAll(hs2);
        System.out.println(hs1);
    }
}
