package second_module.stream_api;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i<n; i++) {
            int input = in.nextInt();
            al.add(input);
        }
        int max = al.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(max);
    }
}
