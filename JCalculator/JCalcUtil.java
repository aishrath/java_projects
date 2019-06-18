package JCalculator;

import java.util.List;

public class JCalcUtil {
    public static void keyPrinter(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void initializeKeyPad(List<Integer> numberList, List<Character> operatorsList) {
        char[] operators = {'/', '*', '-', '+', '='};

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        for (char c : operators) {
            operatorsList.add(c);
        }
    }
}
