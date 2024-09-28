package second_module.methods;

public class Task19 {
    public static void check(int[] array){
        for (int n: array) {
            if (n < 50 && n % 5 == 0) {
                System.out.println(n);
            }
        }
    }
}
