package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public abstract class Animal {
    protected String makeSound ;
    protected String ten;

    public Animal(String makeSound, String ten) {
        this.makeSound = makeSound;
        this.ten = ten;
    }
    public Animal(){

    }

    public String getMakeSound() {
        return makeSound;
    }

    public void setMakeSound(String makeSound) {
        this.makeSound = makeSound;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public abstract String makeSound();


}
