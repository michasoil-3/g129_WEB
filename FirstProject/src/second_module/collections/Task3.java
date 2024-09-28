package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int n = in.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            al.add(input);
            if (input > max) {
                max = input;
            }
        }
        for (int num: al) {
            if (num > secMax && num != max)
                secMax = num;
        }
        System.out.println(secMax);
    }
}