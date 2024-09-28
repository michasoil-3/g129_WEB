package second_module.methods;

public class Task4 {
    public static String palindrome(String str){
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                result = false;
                break;
            }
        }
        return result ? "YES" : "NO";
    }
}
