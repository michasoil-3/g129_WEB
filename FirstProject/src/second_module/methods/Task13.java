package second_module.methods;

public class Task13 {
    public static int countVowels(String str){
        final String vowels = "AEIOUaeiou";
        int count = 0;
        for (char c: str.toCharArray()) {
            if (vowels.indexOf(c) != -1)
                count++;
        }
        return count;
    }
}
