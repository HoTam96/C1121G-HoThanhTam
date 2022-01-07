package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class MainCheckFan {
    public static void main(String[] args) {
      SpeedFan speedFan1 = new SpeedFan(1);
      SpeedFan speedFan2 = new SpeedFan(1);
      SpeedFan speedFan3 = new SpeedFan(1);

      Fan buildFan1 = new Fan(speedFan1,false,5,"yelow");
      Fan buildFan2 = new Fan(speedFan2,true,5,"blue");
      Fan buildFan3 = new Fan(speedFan3,false,5,"red");

        System.out.println(buildFan1.informationFan());
        if (buildFan1.isStatusFan()){
            System.out.println( buildFan1.statusFanOn());
        }else {
            System.out.println(buildFan1.statusFanOff());
        }
        if (buildFan2.isStatusFan()){
            System.out.println( buildFan1.statusFanOn());
        }else {
            System.out.println(buildFan1.statusFanOff());
        }

    }
}
