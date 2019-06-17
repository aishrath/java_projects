package JCalculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static JCalculator.JCalcConfig.DEFAULT_CALCULATOR_TITLE;
import static JCalculator.JCalcUtil.initializeKeyPad;

public class JCalc {
    private String calculatorTitle;
    private final List<Integer> keypadNumbers;
    private final List<Character> keypadOperators;
    private JFrame JCalcFrame;


    JCalc() {
        calculatorTitle = DEFAULT_CALCULATOR_TITLE;
        keypadNumbers = new ArrayList<>();
        keypadOperators = new ArrayList<>();
        JCalcFrame = new JFrame();
        initializeKeyPad(keypadNumbers, keypadOperators);
        JTextPane jTextPane = new JTextPane();
        jTextPane.setBounds(5, 0, 390, 80);
        JCalcFrame.add(jTextPane);
        generateOperatorsOnKeyPad();

        JCalcFrame.setSize(400, 500);
        JCalcFrame.setLayout(null);
        JCalcFrame.setVisible(true);
    }

    private void generateOperatorsOnKeyPad() {
        int start_pos_x = 290;
        int start_pos_y = 50;

        for (Object key : keypadOperators) {
            System.out.println("Adding Operator Key...: " + key.toString());
            JButton b = new JButton(key.toString());
            b.setBounds(start_pos_x, start_pos_y + 50, 100, 40);
            JCalcFrame.add(b);
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
