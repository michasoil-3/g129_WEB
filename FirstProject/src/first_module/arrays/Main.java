package first_module.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        byte size;
        System.out.print("Enter size of array: ");
        size = scanner.nextByte();
        double[] scores = new double[size]; // Creating array without predetermined elements
        // With predetermined: double[] scores = {...};

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element with index " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            sum += scores[i];
        }
        final double average = sum / size;
        System.out.println("The average is " + average + ".");
    }
}
