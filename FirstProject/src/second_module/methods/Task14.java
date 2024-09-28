package second_module.methods;

public class Task14 {
    public static int count(int[] array){
        int count = 0;
        for (int n: array) {
            if (n != 0) count++;
        }
        return count;
    }
}
