package LuyenTapONha.ss1_java_swing_su_kien_mvc.controller;

import LuyenTapONha.ss1_java_swing_su_kien_mvc.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView counterView;
    public CounterListener(CounterView counterView) {
        this.counterView= counterView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Up")){
            this.counterView.increment();
        }else if (src.equals("Down")){
            this.counterView.decrement();
        }

    }
}
