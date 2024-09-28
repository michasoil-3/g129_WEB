package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int input = -1;
        do {
            input = in.nextInt();
            hs.add(input);
        } while (input != 0);
        System.out.println(hs.contains(77) ? "YES" : "NO");
    }
}