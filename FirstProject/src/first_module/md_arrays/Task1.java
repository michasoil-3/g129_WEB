package first_module.md_arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {{12,5,7,6},{4,0,2,7},{9,1,3,2},{10,-2,4,6}};
        Scanner scanner = new Scanner(System.in);
        byte i = scanner.nextByte();
        byte j = scanner.nextByte();
        System.out.println(arr[i][j]);

    }
}
