package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = in.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++) {
            int input = in.nextInt();
            al.add(input);
            sum += input;
        }
        System.out.println((double) sum/n);
    }
}
