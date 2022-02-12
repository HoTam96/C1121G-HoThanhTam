package LuyenTapONha.ss4_java_swing_jtextarea.controller;

import LuyenTapONha.ss4_java_swing_jtextarea.view.FindKeyView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindKeyListening implements ActionListener {
    private FindKeyView findKeyView;

    public FindKeyListening(FindKeyView findKeyView) {
        this.findKeyView = findKeyView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        findKeyView.find();

    }
}
