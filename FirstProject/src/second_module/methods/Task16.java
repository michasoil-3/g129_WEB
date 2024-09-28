package second_module.methods;

public class Task16 {
    public static void printMinAndMax(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: array) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        System.out.println(min + "\n" + max);
    }
}
