package second_module.lambda_functions;

public interface MathOp <T extends Number> {
    T getMax(T a, T b);
}
