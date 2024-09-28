package second_module.methods;

public class Task9 {
    public static void show(int array[]){
        for (int n: array) {
            if (n == 23) {
                return;
            } else if (n % 2 == 1) {
                System.out.println(n);
            }
        }
    }
}
