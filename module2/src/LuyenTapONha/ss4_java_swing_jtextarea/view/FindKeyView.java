package LuyenTapONha.ss4_java_swing_jtextarea.view;

import LuyenTapONha.ss4_java_swing_jtextarea.controller.FindKeyListening;
import LuyenTapONha.ss4_java_swing_jtextarea.model.FindKey;

import javax.swing.*;
import java.awt.*;

public class FindKeyView extends JFrame {
    private JTextArea textArea;
    FindKeyListening findKeyListening = new FindKeyListening(this);
    FindKey findKey = new FindKey();
    private JTextField jTextField_key;
    private JTextField jTextField_result;
    JScrollPane jScrollPane = new JScrollPane();

    public FindKeyView() {
        this.innit();
        this.setVisible(true);
    }

    private void innit() {
        this.setTitle("TÌM KIẾM TỪ KHÓA");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("VĂN BẢN", JLabel.CENTER);
        textArea = new JTextArea(100, 100);
        jScrollPane.setViewportView(textArea);

        JLabel jLabel_key = new JLabel("TỪ KHÓA", JLabel.CENTER);
        JButton jButton = new JButton("THỐNG KÊ");
        jButton.addActionListener(findKeyListening);

        jTextField_key = new JTextField(50);
        jTextField_result = new JTextField(50);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 2, 10, 10));
        jPanel.add(jLabel_key);
        jPanel.add(jTextField_key);
        jPanel.add(jButton);
        jPanel.add(jTextField_result);

        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanel, BorderLayout.SOUTH);
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
    }

    public void find() {
        findKey.setText(textArea.getText());
        findKey.setKey(jTextField_key.getText());
        findKey.findKeys();
        jTextField_result.setText(findKey.getResult());

    }
}
