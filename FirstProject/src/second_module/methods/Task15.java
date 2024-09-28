package second_module.methods;

public class Task15 {
    public static void printUniqueElements(int[] array){
        for (int number: array) {
            int count = 0;
            for (int second: array) {
                if (number == second) count++;
            }
            if (count == 1) {
                System.out.print(number + " ");
            }
        }

    }
}
