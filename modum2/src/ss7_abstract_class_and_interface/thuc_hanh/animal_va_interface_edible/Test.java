package ss7_abstract_class_and_interface.thuc_hanh.animal_va_interface_edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        String display = "";
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());

            }

        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Cam();
        fruits[1] = new Tao();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}