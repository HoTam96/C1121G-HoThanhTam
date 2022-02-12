package LuyenTapONha.ss1_test.view;

import LuyenTapONha.ss1_test.controller.CounterListening;
import LuyenTapONha.ss1_test.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel = new CounterModel();
    private JLabel jLabel;
    private JPanel jPanel;
    private JButton jButton_up;
    private JButton jButton_Down;
    ActionListener counterListening = new CounterListening(this);

    public CounterView() {

        this.unit();
        this.setVisible(true);

    }

    public void unit() {
        this.setTitle("counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jLabel = new JLabel(counterModel.getValue() + "", JLabel.CENTER);
        jPanel = new JPanel();
        jButton_up = new JButton("Up");
        jButton_up.addActionListener(counterListening);
        jButton_Down = new JButton("Down");
        jButton_Down.addActionListener(counterListening);

        jPanel.setLayout(new BorderLayout());
        jPanel.add(jLabel, BorderLayout.CENTER);
        jPanel.add(jButton_up, BorderLayout.WEST);
        jPanel.add(jButton_Down, BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void increment() {
        counterModel.increment();
        this.jLabel.setText(counterModel.getValue() + "");

    }

    public void decrement() {
        counterModel.decrement();
        this.jLabel.setText(counterModel.getValue() + "");
    }


}
