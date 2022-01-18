package case_study.module.module_Furama.information;

public class TrinhDo {
    private String TrungCap;
    private String caoDang;
    private String daiHoc;
    private String SauDaiHoc;

    public TrinhDo(String trungCap, String caoDang, String daiHoc, String sauDaiHoc) {
        TrungCap = trungCap;
        this.caoDang = caoDang;
        this.daiHoc = daiHoc;
        SauDaiHoc = sauDaiHoc;
    }

    public TrinhDo() {
    }

    public String getTrungCap() {
        return TrungCap;
    }

    public void setTrungCap(String trungCap) {
        TrungCap = trungCap;
    }

    public String getCaoDang() {
        return caoDang;
    }

    public void setCaoDang(String caoDang) {
        this.caoDang = caoDang;
    }

    public String getDaiHoc() {
        return daiHoc;
    }

    public void setDaiHoc(String daiHoc) {
        this.daiHoc = daiHoc;
    }

    public String getSauDaiHoc() {
        return SauDaiHoc;
    }

    public void setSauDaiHoc(String sauDaiHoc) {
        SauDaiHoc = sauDaiHoc;
    }

}
