package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public abstract class  Fruit implements Edible{
    protected String tenTraiCay;

    public Fruit(String tenTraiCay) {
        this.tenTraiCay = tenTraiCay;
    }
    public Fruit(){

    }

    public String getTenTraiCay() {
        return tenTraiCay;
    }

    public void setTenTraiCay(String tenTraiCay) {
        this.tenTraiCay = tenTraiCay;
    }



    }

