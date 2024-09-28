package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String input = in.next();
            hs.add(input);
        }
        System.out.println(hs.size());
    }
}
