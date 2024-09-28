package second_module.hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c: str.toCharArray()) {
            if (!hm.containsKey(c))
                hm.put(c, 1);
            else
                hm.put(c, hm.get(c) + 1);
        }
        for (char key: hm.keySet()) {
            System.out.println("'" + key + "' occurs " + hm.get(key) + " times");
        }
    }
}
