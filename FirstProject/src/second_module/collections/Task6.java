package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (i >= l && i <= r) {
                al.add(input);
            }
        }
        for (int i = al.size()-1; i>=0; i--) {
            System.out.print(al.get(i) + " ");
        }
    }
}
