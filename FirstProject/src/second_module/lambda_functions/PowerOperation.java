package second_module.lambda_functions;

public class PowerOperation {
    int getPower(int a, int b) {
        Operator operator = (x, y) -> {
            return (int) MathTools.getMax(x, y);
        };
        return operator.toOperate(a, b);
    }
}
