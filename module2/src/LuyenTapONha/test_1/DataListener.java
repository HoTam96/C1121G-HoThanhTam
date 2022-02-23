package LuyenTapONha.test_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataListener implements ActionListener {
    private DataView dataView;

    public DataListener(DataView dataView) {
        this.dataView = dataView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if (src.equals("Up")) {
            dataView.increment();
        } else if (src.equals("Down")) {
            dataView.decrement();
        }else if (src.equals("Reset")){
            dataView.reset();
        }


    }
}
