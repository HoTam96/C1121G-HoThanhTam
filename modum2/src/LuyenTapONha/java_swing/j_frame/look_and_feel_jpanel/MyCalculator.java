package LuyenTapONha.java_swing.j_frame.look_and_feel_jpanel;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("my calculator");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jTextField, BorderLayout.CENTER);

        JButton jButton0 = new JButton("0");
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
        JButton jButton6 = new JButton("6");
        JButton jButton7 = new JButton("7");
        JButton jButton8 = new JButton("8");
        JButton jButton9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");

        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(5, 3));
        jPanel1.add(jButton0);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel1.add(jButton6);
        jPanel1.add(jButton7);
        jPanel1.add(jButton8);
        jPanel1.add(jButton9);
        jPanel1.add(jButton_cong);
        jPanel1.add(jButton_tru);
        jPanel1.add(jButton_nhan);
        jPanel1.add(jButton_chia);
        jPanel1.add(jButton_bang);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.NORTH);
        this.add(jPanel1, BorderLayout.CENTER);

        this.setVisible(true);


    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");


        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        new MyCalculator();
    }
}
