package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int input;
        do {
            input = in.nextInt();
            if (input != 0)
                hs.add(input);
        } while (input != 0);
        for (int n: hs) {
            al.add(n);
        }
        System.out.println(al);
    }
}
