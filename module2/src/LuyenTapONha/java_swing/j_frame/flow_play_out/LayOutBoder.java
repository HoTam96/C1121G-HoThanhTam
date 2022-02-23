package LuyenTapONha.java_swing.j_frame.flow_play_out;

import javax.swing.*;
import java.awt.*;

public class LayOutBoder extends JFrame {
    public LayOutBoder(){
        this.setTitle("hey tâm");
        this.setLocationRelativeTo(null);
        this.setSize(800,300);
//        set layout
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        JButton jButton1 = new JButton("1");
        JButton jButton2= new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");
this.add(jButton1, BorderLayout.NORTH);
this.add(jButton2, BorderLayout.SOUTH);
this.add(jButton3, BorderLayout.WEST);
this.add(jButton4, BorderLayout.EAST);
this.add(jButton5, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LayOutBoder();
    }
}
