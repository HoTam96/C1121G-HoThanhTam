package ss5_access_modifier_static_method.thuc_hanh.static_method;

public class StaticMethod {
    private int rollno;
    private String name ;
    private static String college="bidv" ;

    StaticMethod(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
      public static void change(){
        college = "codegym";
    }
    void display (){
        System.out.println(rollno+""+ name+" "+ college);
    }
}
