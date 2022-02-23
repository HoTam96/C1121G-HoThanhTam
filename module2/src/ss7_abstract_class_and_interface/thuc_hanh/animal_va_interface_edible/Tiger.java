package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public class Tiger extends Animal {
    public Tiger(String makeSound, String ten) {
        super(makeSound, ten);
    }
public Tiger(){

}

    @Override
    public String makeSound() {
        return "gừm gừm gừm roadzzzzz";
    }

}
