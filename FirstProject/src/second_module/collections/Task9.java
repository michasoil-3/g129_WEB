package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int input = -1;
        do {
            boolean prime = true;
            input = in.nextInt();
            if (input == 1 || (input != 2 && input % 2 == 0)) {
                continue;
            }

            if (input == 2) {
                al.add(input);
                continue;
            }
            for (int i = 3; i <= Math.sqrt(input); i+=2) {
                if (input % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                al.add(input);
            }
        } while (input != 0);
        for (int n: al) {
            System.out.print(n + " ");
        }
    }
}
