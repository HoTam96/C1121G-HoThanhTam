package LuyenTapONha.java_Swing_font.model;

public class LastButtonModel {
    private int value;

    public LastButtonModel(int value) {
        this.value = value;
    }

    public LastButtonModel() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void setValue_1(){
        this.value=1;
    }
    public void setValue_2(){
        this.value=2;
    }
    public void setValue_3(){
        this.value=3;
    }
    public void setValue_4(){
        this.setValue(4);
    }
}
