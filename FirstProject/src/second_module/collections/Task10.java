package second_module.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        int n1 = in.nextInt();
        for (int i = 0; i < n1; i++ ) {
            int input = in.nextInt();
            al1.add(input);
        }

        int n2 = in.nextInt();
        for (int i = 0; i < n2; i++ ) {
            int input = in.nextInt();
            al2.add(input);
        }

        Collections.sort(al1);
        Collections.sort(al2);
        System.out.println("Sorted first array:");
        for (int n: al1) {
            System.out.print(n + " ");
        }
        System.out.println("\nSorted second array:");
        for (int n: al2) {
            System.out.print(n + " ");
        }
        al1.addAll(al2);
        Collections.sort(al1);
        System.out.println("\nSorted third array:");
        for (int n: al1) {
            System.out.print(n + " ");
        }
    }
}
