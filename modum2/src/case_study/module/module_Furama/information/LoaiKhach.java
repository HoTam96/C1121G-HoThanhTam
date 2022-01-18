package case_study.module.module_Furama.information;

public class LoaiKhach {
    private String diamond;
    private String platinium;
    private String gold;
    private String silver;
    private String member;

    public LoaiKhach(String diamond, String platinium, String gold, String silver, String member) {
        this.diamond = diamond;
        this.platinium = platinium;
        this.gold = gold;
        this.silver = silver;
        this.member = member;
    }

    public LoaiKhach() {
    }

    public String getDiamond() {
        return diamond;
    }

    public void setDiamond(String diamond) {
        this.diamond = diamond;
    }

    public String getPlatinium() {
        return platinium;
    }

    public void setPlatinium(String platinium) {
        this.platinium = platinium;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

}
