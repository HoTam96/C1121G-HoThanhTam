package model.deto;

public class EmployeeDeto {

    private String name;
    private String birthDay;
    private String id_card;
    private String phone;
    private String email;
    private String address;

    private Integer employeId;
    private double salary;
    private String positionName;
    private String educationDegreeName;
    private String divisionName;

    public EmployeeDeto() {
    }

    public EmployeeDeto(String name, String birthDay, String id_card, String phone, String email, String address,
                        Integer employeId, double salary, String positionName, String educationDegreeName,
                        String divisionName) {
        this.name = name;
        this.birthDay = birthDay;
        this.id_card = id_card;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.employeId = employeId;
        this.salary = salary;
        this.positionName = positionName;
        this.educationDegreeName = educationDegreeName;
        this.divisionName = divisionName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmployeId() {
        return employeId;
    }

    public void setEmployeId(Integer employeId) {
        this.employeId = employeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getEducationDegreeName() {
        return educationDegreeName;
    }

    public void setEducationDegreeName(String educationDegreeName) {
        this.educationDegreeName = educationDegreeName;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    @Override
    public String toString() {
        return "EmployeeDeto{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", id_card='" + id_card + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", employeId=" + employeId +
                ", salary=" + salary +
                ", positionName='" + positionName + '\'' +
                ", educationDegreeName='" + educationDegreeName + '\'' +
                ", divisionName='" + divisionName + '\'' +
                '}';
    }
}
