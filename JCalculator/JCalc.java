package JCalculator;

import java.util.ArrayList;
import java.util.List;

public class JCalc {
    private String calculatorTitle;
    private final List<Integer> keypadNumbers;
    private final List<Character> keypadOperators;


    JCalc(){
        calculatorTitle = "JCalc";
        keypadNumbers = new ArrayList<>();
        keypadOperators = new ArrayList<>();
        initializeKeyPad(keypadNumbers, keypadOperators);
    }

    private static void initializeKeyPad(List<Integer> numberList, List<Character> operatorsList) {
        char [] operators = {'=', '+', '*', '-'};

        for (int i = 0; i < 10; i++) {
            numberList.add(i);
        }

        for (char c : operators) {
            operatorsList.add(c);
        }
    }

    public String getCalculatorTitle() {
        return calculatorTitle;
    }

    public void setCalculatorTitle(String calculatorTitle) {
        this.calculatorTitle = calculatorTitle;
    }

    public List<Integer> getKeypadNumbers() {
        return keypadNumbers;
    }

    public List<Character> getKeypadOperators() {
        return keypadOperators;
    }

}
