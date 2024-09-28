package second_module.lambda_functions;

import java.util.ArrayList;
import java.util.Scanner;

interface Operation {
    void doOperation(ArrayList<String> al);
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        String input;
        do {
            input = in.next();
            if (!input.equals("exit")) {
                al.add(input);
            }
        } while (!input.equals("exit"));

        Operation sorter = (arraylist) -> arraylist.sort(
                (s1, s2) -> (s1.length() - s2.length())
        );
        sorter.doOperation(al);
        System.out.println(al);
    }
}