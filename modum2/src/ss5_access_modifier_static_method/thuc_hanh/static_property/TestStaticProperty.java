package ss5_access_modifier_static_method.thuc_hanh.static_property;

public class TestStaticProperty {
    public void main(String[] args) {
        Car car1 = new Car("lambogimi", "v8.1");
        System.out.println(Car.getNumberOfCar());
        Car car2 = new Car("ferrari","v8.4");
        System.out.println(Car.numberOfCar);

    }
}