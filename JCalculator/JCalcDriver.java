package JCalculator;


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
        JCalc jCalc =  new JCalc();
        for (int key : jCalc.getKeypadNumbers()) {
            System.out.println(key);
        }

        for (char key : jCalc.getKeypadOperators()) {
            System.out.println(key);
        }
    }
}