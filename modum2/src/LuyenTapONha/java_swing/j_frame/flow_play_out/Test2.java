package LuyenTapONha.java_swing.j_frame.flow_play_out;

import javax.swing.*;
import java.awt.*;

public class Test2 extends JFrame {
    public Test2(){
        this.setTitle("dương yêu tâm");
        this.setLocationRelativeTo(null);
        this.setSize(800,400);
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT);

        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.CENTER,10,10);
        this.setLayout(flowLayout2);

        JButton j1 = new JButton("tâm");
        JButton j2 = new JButton("dương");
        JButton j3 = new JButton("con tâm và dương1");
//thêm thành phần button
        this.add(j1);
        this.add(j2);
        this.add(j3);

//tắt chương trình sau khi thoát
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        

    }

    public static void main(String[] args) {
        new Test2();
    }
}
