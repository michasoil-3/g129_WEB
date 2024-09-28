package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        int input = -1;
        do {
            input = in.nextInt();
            if (input < 0) {
                al.add(input);
                if (input > max) {
                    max = input;
                }
            }
        } while (input != 0);
        for (int n: al) {
            System.out.print(n + " ");
        }
        System.out.println("\n" + max);
    }
}
