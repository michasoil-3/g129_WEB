package first_module.types;

public class Main {
    public static void main(String[] args) {
        // Good binds: psvm, sout

        // Primitivnye
        byte number1 = 127; // range: -128 to 127
        short number2 = 32767; // range: -32768 to 32767
        int number3 = 2147769; // range: -2147483648 to 2147483647
        long number4 = 9223372036854775807L; // range: -9223372036854775808 to 9223372036854775807
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        // Sostavnye
        float number5 = 1843435426.52F;
        double number6 = 3953964050.1546;

        // Slozhnye
        String name = "Adam";
        System.out.println((number1 + number2)/2 * 10);
    }
}
