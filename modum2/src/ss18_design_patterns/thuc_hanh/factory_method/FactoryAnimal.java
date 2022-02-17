package ss18_design_patterns.thuc_hanh.factory_method;

public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("canine".equals(type)){
            return new Dog();
        }else {
            return new Cat();
        }
    }
}
