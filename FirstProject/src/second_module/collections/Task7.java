package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> all = new ArrayList<>();
        ArrayList<Integer> repeated = new ArrayList<>();
        int input = -1;
        do {
            input = in.nextInt();
            if (all.contains(input)) {
                repeated.add(input);
            }
            all.add(input);
        } while (input != 0);

        for (int n: repeated)
            System.out.print(n + " ");
    }
}

