package JCalculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static JCalculator.JCalcConfig.DEFAULT_CALCULATOR_TITLE;
import static JCalculator.JCalcUtil.initializeKeyPad;
import static java.util.Collections.reverse;

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
        generateNumbersOnKeyPad();

        JCalcFrame.setSize(400, 400);
        JCalcFrame.setLayout(null);
        JCalcFrame.setVisible(true);
    }

    private void generateOperatorsOnKeyPad() {
        int start_pos_x = 290;
        int start_pos_y = 50;

        for (Object key : keypadOperators) {
            if (JCalcConfig.DEBUG_MODE)
                System.out.println("Adding Operator Key...: " + key.toString());

            JButton b = new JButton(key.toString());
            start_pos_y += 50;

            if (JCalcConfig.DEBUG_MODE)
                System.out.println("Inserting a button: x:" + start_pos_x + " y:" + start_pos_y);

            b.setBounds(start_pos_x, start_pos_y, 100, 40);
            JCalcFrame.add(b);
        }
    }

    private void generateNumbersOnKeyPad() {
        int start_pos_x = 5;
        int start_pos_y = 90;
        reverse(keypadNumbers);

        for (int i = 0; i < 3; i++) {
            Object key = keypadNumbers.get(i);
            JButton b = new JButton(key.toString());
            start_pos_x += 50;
            b.setBounds(start_pos_x, start_pos_y, 55, 40);
            JCalcFrame.add(b);
        }

        start_pos_x = 5;
        start_pos_y = 150;
        for (int i = 3; i < 6; i++) {
            Object key = keypadNumbers.get(i);
            JButton b = new JButton(key.toString());
            start_pos_x += 50;
            b.setBounds(start_pos_x, start_pos_y, 55, 40);
            JCalcFrame.add(b);
        }

        start_pos_x = 5;
        start_pos_y = 250;
        for (int i = 6; i < 9; i++) {
            Object key = keypadNumbers.get(i);
            JButton b = new JButton(key.toString());
            start_pos_x += 50;
            b.setBounds(start_pos_x, start_pos_y, 55, 40);
            JCalcFrame.add(b);
        }

        /*for (Object key : keypadNumbers) {
            if (JCalcConfig.DEBUG_MODE)
                System.out.println("Adding Operator Key...: " + key.toString());

            JButton b = new JButton(key.toString());
            start_pos_x += 25;
            start_pos_y += 50;

            if (JCalcConfig.DEBUG_MODE)
                System.out.println("Inserting a button: x:" + start_pos_x + " y:" + start_pos_y);

            b.setBounds(start_pos_x, start_pos_y, 100, 40);
            JCalcFrame.add(b);
        }*/
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
