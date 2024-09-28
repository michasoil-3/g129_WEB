package first_module.arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {6,19,26,9,46,8,5,65,90,25};
        Scanner scanner = new Scanner(System.in);
        byte index = scanner.nextByte();
        System.out.println(nums[index]);
    }
}
