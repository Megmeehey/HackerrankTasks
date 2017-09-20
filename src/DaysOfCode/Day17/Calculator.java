package DaysOfCode.Day17;

public class Calculator {
    public int power(int a, int b) throws ArithmeticException {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("n and p should be non-negative");
        }
        return (int) Math.pow(a, b);
    }
}
