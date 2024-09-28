package second_module.methods;

public class Task17 {
    public static double operate(int a, int b, char c){
        switch (c) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            default:
                return (double)a/b;
        }
    }
}
