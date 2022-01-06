package ss5_access_modifier_static_method.bai_tap.xay_dung_lop;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println(student1.getTen());
        System.out.println(student1.getLop());
        student1.setLop("c11");
        student1.setTen("tam");
        System.out.println(student1.getTen());
        System.out.println(student1.getLop());

    }



}
