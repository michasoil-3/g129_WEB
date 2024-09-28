package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int input;
        do {
            input = in.nextInt();
            hs.add(input);
        } while (input != 0);
        int searchFor = in.nextInt();
        boolean inSet = false;
        for (int n: hs) {
            if (n == searchFor) {
                inSet = true;
                break;
            }
        }
        if (inSet) {
            System.out.println("Number " + searchFor + " included in the set.");
        } else {
            System.out.println("Number " + searchFor + " not included in the set.");
        }
    }
}
