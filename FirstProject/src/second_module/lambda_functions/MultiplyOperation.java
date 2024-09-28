package second_module.lambda_functions;

public class MultiplyOperation {
    int getMultiplication(int a, int b) {
        Operator operator = (x, y) -> x * y;
        return operator.toOperate(a, b);
    }
}
