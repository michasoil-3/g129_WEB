package second_module.collections;

import java.util.Scanner;
import java.util.HashSet;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int input = in.nextInt();
            hs.add(input);
        }
        for (int n: hs) {
            sum += n;
        }
        System.out.println(sum);
    }
}
