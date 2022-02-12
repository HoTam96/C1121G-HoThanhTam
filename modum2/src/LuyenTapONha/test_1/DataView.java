package LuyenTapONha.test_1;

import javax.swing.*;
import java.awt.*;

public class DataView extends JFrame {
    Data data = new Data();
    JPanel jPanel_data = new JPanel();
    JLabel jLabel = new JLabel(data.getValue()+"",JLabel.CENTER);
    DataListener dataListener = new DataListener(this);
    public DataView(){
        this.setTitle("dataView");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton_up = new JButton("Up");
        jButton_up.addActionListener(dataListener);
        JButton jButton_down = new JButton("Down");
        jButton_down.addActionListener(dataListener);
        JButton jButton_reset = new JButton("Reset");
        jButton_reset.addActionListener(dataListener);
        jPanel_data.setLayout(new BorderLayout());
        jPanel_data.add(jButton_up,BorderLayout.WEST);
        jPanel_data.add(jLabel,BorderLayout.CENTER);
        jPanel_data.add(jButton_down,BorderLayout.EAST);
        jPanel_data.add(jButton_reset,BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel_data,BorderLayout.CENTER);
        this.setVisible(true);

    }
    public void increment(){
        data.increment();
        jLabel.setText(data.getValue()+"");
    }
    public void decrement(){
        data.decrement();
        jLabel.setText(data.getValue()+"");
    }
    public void reset(){
        data.reset();
        jLabel.setText(data.getValue()+"");
    }


}
