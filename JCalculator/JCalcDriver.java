package JCalculator;

import JCalculator.services.CalculatorService;

import static JCalculator.JCalcUtil.keyPrinter;

/**
 * This program and its associated files
 * is an implementation of a simple
 * calculator that can perform basic arithmetic
 * operations.
 *
 * @author Aishwareeya Rath
 * @version 0.1
 */
public class JCalcDriver {
    public static void main(String[] args) {
        JCalc jCalc = new JCalc();
        CalculatorService calculatorService = new CalculatorService();

        if (JCalcConfig.DEBUG_MODE) {
            System.out.println(jCalc.getCalculatorTitle());
            keyPrinter(jCalc.getKeypadNumbers());
            keyPrinter(jCalc.getKeypadOperators());
        }

        System.out.println(calculatorService.add(5, 4));
    }
}