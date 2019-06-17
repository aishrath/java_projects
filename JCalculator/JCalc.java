package JCalculator;

import java.util.ArrayList;
import java.util.List;

import static JCalculator.JCalcUtil.initializeKeyPad;

public class JCalc {
    private String calculatorTitle;
    private final List<Integer> keypadNumbers;
    private final List<Character> keypadOperators;


    JCalc() {
        calculatorTitle = "JCalc";
        keypadNumbers = new ArrayList<>();
        keypadOperators = new ArrayList<>();
        initializeKeyPad(keypadNumbers, keypadOperators);
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
