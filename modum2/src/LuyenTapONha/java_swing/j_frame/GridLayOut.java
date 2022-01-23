package LuyenTapONha.java_swing.j_frame;

import javax.swing.*;
import java.awt.*;

public class GridLayOut extends JFrame {
    public GridLayOut() {
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4,4);
        GridLayout gridLayout2 = new GridLayout(4,4,90,5);
        this.setLayout(gridLayout2);
        this.setTitle("xin chào mọi người");
        this.setLocationRelativeTo(null);
        this.setSize(800, 400);

//        JButton jButton = new JButton("1");
//        JButton jButton1 = new JButton("2");
//        JButton jButton2 = new JButton("3");
//        this.add(jButton);
//        this.add(jButton1);
//        this.add(jButton2);

        for (int i = 0; i < 16; i++) {
            JButton jButton = new JButton(i+"");
            this.add(jButton);

        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayOut();

    }

}
