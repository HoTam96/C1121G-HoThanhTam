package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public class Chicken extends Animal implements Edible {
    public Chicken(String makeSound, String ten) {
        super(makeSound, ten);
    }
    public Chicken(){

    }

    @Override
    public String makeSound() {
        return "ò ó o o";
    }

    @Override
    public String howToEat() {
        return "ăn ta đi ta là gà đây ";
    }

}
