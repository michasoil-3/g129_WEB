package second_module.stream_api;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i<n; i++) {
            int input = in.nextInt();
            al.add(input);
        }
        al.stream().filter(s -> s > 0).forEach(s -> System.out.print(s + " "));
    }
}

