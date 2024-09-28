package second_module.methods;

public class Task1 {
    public static int getMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if (max < a) {
            max = a;
        }
        if (max < b ) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
