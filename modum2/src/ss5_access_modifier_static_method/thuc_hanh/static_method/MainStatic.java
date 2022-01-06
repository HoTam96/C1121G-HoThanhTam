package ss5_access_modifier_static_method.thuc_hanh.static_method;

public class MainStatic {
    public static void main(String[] args) {
StaticMethod staticMethod = new StaticMethod(5,"tâm");
StaticMethod.change();
staticMethod.display();
    }
}
