package second_module.methods;

public class Task7 {
    public static double getAverage(int array[]){
        double sum = 0;
        int evens = 0;
        for (int n: array) {
            if (n % 2 == 0) {
                sum += n;
                evens++;
            }
        }
        return sum/evens;
    }
}
