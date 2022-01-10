package LuyenTapONha.e_num;

public enum Day {
    january (30,4,"ba"),
    February(29,2,"hai"),
    March(31,2,"hai"),
    April(30,2,"hai"),
    May(31,2,"hai"),
    June(30,2,"hai"),
    July(31,2,"hai"),
    August(31,2,"hai"),
    September(30,2,"hai"),
    October(31,2,"hai"),
    November(30,2,"hai"),
    December(31,2,"hai"),
    ;

    private int soNgay;
    private int tuan;
    private String thu;
       Day(int soNgaay,int tuan,String thu){
        this.soNgay=soNgaay;
        this.tuan=tuan;
        this.thu=thu;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public int getTuan() {
        return tuan;
    }

    public void setTuan(int tuan) {
        this.tuan = tuan;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }
}