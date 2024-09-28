package second_module;

public class Main {
    public static void main(String[] args) {
        getInfo();
        printOperation(5, 7);
        System.out.println(getOperation(6, 8));
    }

    public static void getInfo() {
        System.out.println("Hello world!");
    }

    public static void printOperation(int a, int b) {
        System.out.println(a + b);
    }

    public static int getOperation(int a, int b) {
        return a+b;
    }
}
