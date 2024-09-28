package second_module.hashmaps;

import java.util.Scanner;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String phrases = in.nextLine();
        for (String word: phrases.split(" ")) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        for (String word: map.keySet()) {
            System.out.println("'" + word + "' occurs " + map.get(word) + " times");
        }
    }
}
