package second_module.methods;

public class Task2 {
    public static String triangle(int a, int b, int c){
        return (a + b > c && a + c > b && b + c > a) ? "YES" : "NO";
    }
}
