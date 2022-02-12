package LuyenTapONha.java_swing_jtextfiled.view;

import LuyenTapONha.java_swing_jtextfiled.controller.CalculatorListening;
import LuyenTapONha.java_swing_jtextfiled.model.MiniCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    MiniCalculator miniCalculator = new MiniCalculator();
    private JTextField jTextField_1st;
    private JTextField jTextField_2nd;
    private JTextField jTextField_answer;
    ActionListener actionListener = new CalculatorListening(this);
    private JLabel jLabel_answer;


    public CalculatorView() {
        this.unit();
        this.setVisible(true);
    }

    private void unit() {
        this.setTitle("My calculator");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 20);

        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(actionListener);
        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(actionListener);
        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(actionListener);
        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(actionListener);
        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(actionListener);
        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(actionListener);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2, 3, 10, 10));
        jPanel_center.add(jButton_plus);
        jPanel_center.add(jButton_minus);
        jPanel_center.add(jButton_multiply);
        jPanel_center.add(jButton_divide);
        jPanel_center.add(jButton_pow);
        jPanel_center.add(jButton_mod);

        Font font1 = new Font("Arial", Font.BOLD, 30);

        JLabel jLabel_1stValue = new JLabel("1st Value");
        jLabel_1stValue.setFont(font1);
        JLabel jLabel_2ndValue = new JLabel("2nd Value");
        jLabel_2ndValue.setFont(font1);
         jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font1);

        jTextField_1st = new JTextField(50);
        jTextField_1st.setFont(font1);
        jTextField_2nd = new JTextField(50);
        jTextField_2nd.setFont(font1);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font1);

        JPanel jPanelFooter = new JPanel();
        jPanelFooter.setLayout(new GridLayout(3, 2, 20, 20));
        jPanelFooter.add(jLabel_1stValue);
        jPanelFooter.add(jTextField_1st);
        jPanelFooter.add(jLabel_2ndValue);
        jPanelFooter.add(jTextField_2nd);
        jPanelFooter.add(jLabel_answer);
        jPanelFooter.add(jTextField_answer);

        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanelFooter, BorderLayout.NORTH);

    }

    public void plus() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.plus();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }
    public void minus() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.minus();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }
    public void mutiply() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.multiply();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }
    public void divide() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.divide();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }
    public void pow() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.pow();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }
    public void mod() {
        miniCalculator.setFirstValue(Double.parseDouble(jTextField_1st.getText()));
        miniCalculator.setSecondValue(Double.parseDouble(jTextField_2nd.getText()));
        miniCalculator.mod();
        jTextField_answer.setText(miniCalculator.getAnswer()+"");

    }


}
