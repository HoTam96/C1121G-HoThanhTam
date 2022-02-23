package LuyenTapONha.ss1_test.controller;

import LuyenTapONha.ss1_test.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListening implements ActionListener {
    private CounterView counterView;
    public CounterListening(CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src= e.getActionCommand();
        if (src.equals("Up")){
            this.counterView.increment();
        }else if (src.equals("Down")){
            this.counterView.decrement();
        }

    }
}
