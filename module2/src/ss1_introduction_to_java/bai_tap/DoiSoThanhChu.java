package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class DoiSoThanhChu {

//    hàm đọc đơn vị hàng đơn vị
    public static String unit1 (int number1){
        String str = "";
        switch (number1) {

            case 0:
                str += "zezo";
                break;
            case 1:
                str += "one";
                break;
            case 2:
                str += "two";
                break;
            case 3:
                str += "three";
                break;
            case 4:
                str += "four";
                break;
            case 5:
                str += "five";
                break;
            case 6:
                str += "six";
                break;
            case 7:
                str += "seven";
                break;
            case 8:
                str += "eight";
                break;
            case 9:
                str += "nine";
                break;
            case 10:
                str += "ten";
                break;
        }
        return str;
    }

//    hàm đọc đơn vị hàng chục
    public static String unit2(int number2){

        String str1 = "";
        int odd = (number2%10);
        int even = number2-odd;

     String le = unit1(odd);
     switch (even){
         case 10:
             str1+="ten";
             break;
         case 20:
             str1+="twenty";
             break;
         case 30:
             str1+="thirty";
             break;
         case 40:
             str1+="forty";
             break;
         case 50:
             str1+="Fifty";
             break;
         case 60:
             str1+="sixty";
             break;
         case 70:
             str1+="seventy";
             break;
         case 80:
             str1+="eighty";
             break;
         case 90:
             str1+="Ninety";
             break;
     }
     str1=str1+"-"+le;
     return str1;

    }

// unit3 hàm đọc đơn vị hàng trăm
    public static String unit3(int number3) {
        String str2 = "";
        int odd = (number3 % 100);
        int even = number3 - odd;
        String le = unit2(odd);
        switch (even){
            case 100:
                str2+="One hundred";
                break;
            case 200:
                str2+="two hundred";
                break;
            case 300:
                str2+="three hundred";
                break;
            case 400:
                str2+="four hundred";
                break;
            case 500:
                str2+="five hundred";
                break;
            case 600:
                str2+="six hundred";
                break;
            case 700:
                str2+="seven hundred";
                break;
            case 800:
                str2+="eight hundred";
                break;
            case 900:
                str2+="nine hundred";
                break;
        }
        str2 = str2+" "+le;
        return str2;
    }
//    unit 4 số từ 11-20
    public static String unit4(int number4){
        String str4 ="";
        switch (number4){
            case 11:
                str4+="eleven";
                break;
            case 12:
                str4+="twelve";
                break;
            case 13:
                str4+="thirteen";
                break;
            case 14:
                str4+="fourteen";
                break;
            case 15:
                str4+="fifteen";
                break;
            case 16:
                str4+="sixteen";
                break;
            case 17:
                str4+="seventeen";
                break;
            case 18:
                str4+="eighteen";
                break;
            case 19:
                str4+="nineteen";
                break;
        }
        return str4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số muốn chuyển đổi");
        int data = Integer.parseInt(sc.nextLine());
        if (data<=10){
            System.out.println( unit1(data));
        }
        else if (data<20){
            System.out.println(unit4(data));
        }
        else if (data<=99){
            System.out.println(unit2(data));

        }
        else if (data<=999){
            System.out.println(unit3(data));
        }
        else {
            System.out.println("vượt ngoài phạm vi tìm kiếm");
        }

    }
}
