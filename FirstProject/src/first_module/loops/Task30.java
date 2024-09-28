package first_module.loops;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short firstBananaPrice = scanner.nextShort();
        short soldierBalance = scanner.nextShort();
        short bananasToBuy = scanner.nextShort();
        int totalPrice = 0;
        for (int i = 1; i <= bananasToBuy; i++) {
            totalPrice += i * firstBananaPrice;
        }
        if (totalPrice > soldierBalance)
            System.out.println(totalPrice - soldierBalance);

    }
}
