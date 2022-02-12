package LuyenTapONha.java_Swing_font.view;

import LuyenTapONha.java_Swing_font.controller.ButtonListener;
import LuyenTapONha.java_Swing_font.model.LastButtonModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LastButtonView extends JFrame {
    private  JLabel jLabel;
    LastButtonModel lastButtonModel = new LastButtonModel();
    ButtonListener buttonListener = new ButtonListener(this);
    Font font = new Font("Arial",Font.BOLD,50);

    public LastButtonView(){
        this.init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("LastButton");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JButton jButton_1 = new JButton("1");
        jButton_1.setFont(font);
        jButton_1.setForeground(Color.black);
        jButton_1.setBackground(Color.yellow);
        jButton_1.addActionListener(buttonListener);
        JButton jButton_2 = new JButton("2");
        jButton_2.setFont(font);
        jButton_2.setForeground(Color.black);
        jButton_2.setBackground(Color.CYAN);
        jButton_2.addActionListener(buttonListener);
        JButton jButton_3 = new JButton("3");
        jButton_3.setFont(font);
        jButton_3.setForeground(Color.black);
        jButton_3.setBackground(Color.red);
        jButton_3.addActionListener(buttonListener);
        JButton jButton_4 = new JButton("4");
        jButton_4.setFont(font);
        jButton_4.setForeground(Color.black);
        jButton_4.setBackground(Color.lightGray);
        jButton_4.addActionListener(buttonListener);

        jLabel = new JLabel("----------",JLabel.CENTER);
        jLabel.setFont(font);
        jLabel.setForeground(Color.red);



        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(jButton_1);
        jPanel.add(jButton_2);
        jPanel.add(jButton_3);
        jPanel.add(jButton_4);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        this.add(jLabel,BorderLayout.SOUTH);
    }
    public void change_1(){
        lastButtonModel.setValue_1();
        jLabel.setForeground(Color.black);
        jLabel.setBackground(Color.yellow);
        jLabel.setOpaque(true);
       jLabel.setText("Button= "+ lastButtonModel.getValue());



    }
    public void change_2(){
        lastButtonModel.setValue_2();
        jLabel.setForeground(Color.black);
        jLabel.setBackground(Color.CYAN);
        jLabel.setText("Button= "+ lastButtonModel.getValue());


    }
    public void change_3(){
        lastButtonModel.setValue_3();
        jLabel.setForeground(Color.black);
        jLabel.setBackground(Color.red);

        jLabel.setText("Button= "+ lastButtonModel.getValue());


    }
    public void change_4(){
        lastButtonModel.setValue_4();
        this.jLabel.setForeground(Color.black);
        this.jLabel.setBackground(Color.lightGray);
        jLabel.setText("Button= "+ lastButtonModel.getValue());



    }
}
