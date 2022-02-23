package case_study.data.validate;

import case_study.until.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TotalValidate {
    static Scanner scanner = new Scanner(System.in);

    public static final String REGEX_DAY = "(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})";

    public static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]+( ?[A-Z][a-z]+)*";

    public static final String REGEX_SERVICE_CODE = "^SV(VL|HO|RO)-\\d{4}$";
    public static final String REGEX_MaBenhAn = "^BA-\\d{3}$";
    public static final String REGEX_MaBenhNhan = "^BN-\\d{4}$";
    // là số thực có số lớn hơn 30
    public static final String REGEX_AREA_POOL = "^([3-9]\\d|[1-9]\\d{2,})(.?[0-9]+)?$";

    //số  nguyên dương lớn hơn 0
    public static final String REGEX_so_nguyen_duong = "^[0]?[1-9]+[0-9]*$";
    // số lượng người lớn hơn 0 và nhỏ hơn 20
    public static final String REGEX_so_luong = "^([1-9]|([1][0-9])|(20))$";
    //số điện thoại
    public static final String REGEX_so_Dien_Thoai = "^0[0-9]\\d{8}";
//    số điện thoại 2
    public static final String ReGEX_SDT2 = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
    //validate email;
    public static final String REGEX_EMAIL = "^\\w+\\.?[\\w]+@[a-z]+\\.[a-z]+$";
    //tiền , tiền lương tiền ( là số tự nhiên lớn hơn hoặc bằng  0 )
    public static final String REGEX_TIEN = "^[0-9]+(\\.?\\d+)?";
//    định dạng là số
    public static final String REGEX_SO = "^\\d+";
    public static final String REGEX_chu = "[^\\d]+";
//    số dương là số thực lớn hơn 0
//    có thể regex tiền
    public static final String REGEX_SO_THUC_DUONG ="^([1-9](\\.?[0-9]+)?)|0\\.[1-9]+";
    public static final String REGEX_TIEN_LON_HON_0 ="^([1-9](\\.?[0-9]+)?)|0\\.[1-9]+";
//     casedy09
    public static final String REGEX_TRANG_THAI_09 = "^(Da sua chua)|(Chua sua chua)$";
//    regex ten chuẩn ko dấu
    public  static final String REGEX_TEN ="^[A-Z][a-z]*(([ ][A-Z][a-z]*)+)?$";

//    public static final String DATE_LEAP_YEAR =
//    "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";


    public static String regexString(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        while (true) {
            try {
                if (temp.matches(regex)){
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, dateTimeFormatter);
                    LocalDate now = LocalDate.now();
                    int year = Period.between(age, now).getYears();
                    if (year > 18 && year < 100) {
                        break;
                    } else {
                        throw new AgeException("tuổi phải lớn hơn 18 và bé hơn 100");
                    }

                } else {
                    throw new AgeException("định dạng nhập vào không đúng");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                System.out.println("mời nhập lại");
                temp = scanner.nextLine();
            }

        }
        return temp;
    }

}

