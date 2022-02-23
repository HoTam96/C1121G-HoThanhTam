package LuyenTapONha.java_swing_jtextfiled.controller;

import LuyenTapONha.java_swing_jtextfiled.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorListening implements ActionListener {
    private CalculatorView calculatorView;

    public CalculatorListening(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("+")) {
            calculatorView.plus();
        } else if (src.equals("-")) {
            calculatorView.minus();
        }else if (src.equals("*")) {
            calculatorView.mutiply();
        }else if (src.equals("/")) {
            calculatorView.divide();
        }else if (src.equals("^")) {
            calculatorView.pow();
        }else if (src.equals("%")) {
            calculatorView.mod();
        }
    }
}
