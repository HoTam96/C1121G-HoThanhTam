package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public class Cam extends Fruit{
    public Cam() {
        super("cam");
    }

    @Override
    public String howToEat() {
        return "ăn cam";
    }
}
