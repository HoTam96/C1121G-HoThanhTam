package LuyenTapONha.ss4_java_swing_jtextarea.model;

public class FindKey {
    private String key;
    private String text;
    private String result;

    public FindKey() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void findKeys() {
        int count = 0;
        int index = 0;
        while (true) {
            int i = this.text.indexOf(this.key, index);
            if (i == -1) {
                break;
            } else {
                count++;
                index = i + 1;
            }

        }
        this.result = "kết quả: "+ "có "+ count+" "+ key ;

    }
}
