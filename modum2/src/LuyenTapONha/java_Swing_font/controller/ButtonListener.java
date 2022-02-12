package LuyenTapONha.java_Swing_font.controller;

import LuyenTapONha.java_Swing_font.view.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private LastButtonView lastButtonView;

    public ButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("1")){
            lastButtonView.change_1();
        }else if (button.equals("2")){
            lastButtonView.change_2();
        }else if (button.equals("3")){
            lastButtonView.change_3();
        }else if (button.equals("4")){
            lastButtonView.change_4();
        }
    }
}
