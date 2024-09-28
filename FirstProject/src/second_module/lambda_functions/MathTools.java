package second_module.lambda_functions;

public class MathTools {
    public static int getMax(int a, int b) {
        MathOp operator = (x, y) -> (x.intValue() > y.intValue() ? x : y);
        return (int) operator.getMax(a, b);
    }

    public static int getPower(int a, int b) {
        MathOp operator = (x, y) -> (Math.pow(x.intValue(), y.intValue()));
        return (int) operator.getMax(a, b);
    }
}
