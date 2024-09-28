package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        int input = -1;
        do {
            input = in.nextInt();
            hs.add(input);
        } while (input != 0);
        for (int n: hs) {
            sum += n;
        }
        System.out.println(sum);
    }
}
