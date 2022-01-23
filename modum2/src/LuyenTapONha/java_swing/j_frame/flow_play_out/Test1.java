package LuyenTapONha.java_swing.j_frame.flow_play_out;

import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {
    public Test1(){
        this.setTitle("dương yêu tâm");
        this.setLocationRelativeTo(null);
        this.setSize(300,300);
        FlowLayout flowLayout = new FlowLayout();
        this.setLayout(flowLayout);

        JButton j1 = new JButton("tâm");
        JButton j2 = new JButton("dương");
        JButton j3 = new JButton("con tâm và dương");
//thêm thành phần button
        this.add(j1);
        this.add(j2);
        this.add(j3);

//tắt chương trình sau khi thoát
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new Test1();
    }
}
