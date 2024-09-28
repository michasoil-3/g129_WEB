package second_module.methods;

public class Task3 {
    public static int check(String str, char letter){
        int count = 0;
        for (char c: str.toLowerCase().toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count;
    }
}
