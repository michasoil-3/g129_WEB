package second_module.methods;

public class Task10 {
    public static int getSum(int array[]){
        int sum = 0;
        for (int n: array) {
            if (n % 5 != 0)
                sum += n;
        }
        return sum;

    }
}
