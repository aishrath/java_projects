package JCalculator;


import java.util.List;

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

        keyPrinter(jCalc.getKeypadNumbers());
        keyPrinter(jCalc.getKeypadOperators());

    }

    private static void keyPrinter(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}