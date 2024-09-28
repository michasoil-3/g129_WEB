package second_module.methods;

public class Task8 {
    public static void replace(int array[][]){
        int[] temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        for (int[] line: array) {
            for (int number: line) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
