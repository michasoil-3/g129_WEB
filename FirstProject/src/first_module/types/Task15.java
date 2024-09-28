package first_module.types;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String companyName = scanner.next();
        int profit = scanner.nextInt();
        double month = scanner.nextDouble();
        double perMonth = profit / month;
        System.out.println("Company " + companyName + " earns " + perMonth + " dollars in a month");
    }
}
