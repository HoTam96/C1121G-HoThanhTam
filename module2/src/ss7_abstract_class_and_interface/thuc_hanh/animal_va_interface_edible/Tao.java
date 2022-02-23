package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public class Tao extends Fruit {

    public Tao() {
        super("tao");
    }

    @Override
    public String howToEat() {
        return "ăn tao";
    }
}
