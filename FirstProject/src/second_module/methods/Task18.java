package second_module.methods;

public class Task18 {
    public static void printMax(int[][] array){
        for (int[] line: array) {
            int max = Integer.MIN_VALUE;
            for (int element: line) {
                if (element > max) {
                    max = element;
                }
            }
            System.out.println(max);
        }
    }
}
