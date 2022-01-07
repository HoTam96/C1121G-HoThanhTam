package ss4_lop_va_doi_tuong_trong_java.bai_tap;

public class QuaDraticEqution {
    private double a ;
    private double b ;
    private double c ;

    public QuaDraticEqution(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double denta (){
        return (this.b*this.b)-4*this.a*this.c;
    }
    public double nghiem1(){
        return (-(this.b)+Math.sqrt(denta()))/(2*this.a);
    }
    public double nghiem2(){
        return (-(this.b)-Math.sqrt(denta()))/(2*this.a);
    }
    public double nghiemKep(){
        return(-this.b)/(2*this.a);
    }
    public static void main(String[] args) {
        QuaDraticEqution buildQuaDraticEqution = new QuaDraticEqution(1,3,1);
        if (buildQuaDraticEqution.denta()>0){
            System.out.println("x1= "+buildQuaDraticEqution.nghiem1());
            System.out.println("x2= "+ buildQuaDraticEqution.nghiem2());
        }else if (buildQuaDraticEqution.denta()<0){
            System.out.println("phương trình vô nghiệm");
        }
        else {
            System.out.println("phương trình có nghiệm kép: x1=x2 = " + buildQuaDraticEqution.nghiemKep());

        }


    }
}
