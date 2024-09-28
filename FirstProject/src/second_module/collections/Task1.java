package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = in.nextInt();
        int input;
        for (int i=0;i<n;i++) {
            input = in.nextInt();
            al.add(input/2);
        }
        for (int number: al) {
            System.out.print(number + " ");
        }
    }
}
