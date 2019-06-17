package JCalculator.services;

import JCalculator.interfaces.CalculatorOperationsInterface;

public class CalculatorService implements CalculatorOperationsInterface {
    @Override
    public Integer add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer subtract(int a, int b) {
        return a - b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }

    @Override
    public Integer divide(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("Cannot Divide by Zero!");
        return a / b;
    }
}
