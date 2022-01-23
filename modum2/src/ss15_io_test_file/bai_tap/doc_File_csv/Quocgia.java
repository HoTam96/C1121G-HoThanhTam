package ss15_io_test_file.bai_tap.doc_File_csv;

public class Quocgia {
    private int id;
    private String code;
    private String name;

    public Quocgia(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public Quocgia() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Quocgia{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

