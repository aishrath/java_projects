package JCalculator.services;

import JCalculator.interfaces.CalculatorOperationsInterface;

public class CalculatorService implements CalculatorOperationsInterface<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;

    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;

    }

    @Override
    public Integer divide(Integer a, Integer b) throws Exception {
        if (b == 0)
            throw new Exception("Cannot Divide by Zero!");
        return a / b;
    }
}
