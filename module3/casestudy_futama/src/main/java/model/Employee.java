package model;

public class Employee extends Person {
    private double salary;
    private Position positionId;
    private EducationDegree educationDegreeId;
    private Division divisionId;
    private User userName ;

    public Employee(Integer id, String name, String birthDay, String id_card, String phone, String email, String address, double salary, Position positionId, EducationDegree educationDegreeId, Division divisionId, User userName) {
        super(id, name, birthDay, id_card, phone, email, address);
        this.salary = salary;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.userName = userName;
    }


    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(EducationDegree educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserName() {
        return userName;
    }

    public void setUserName(User userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", positionId=" + positionId +
                ", educationDegreeId=" + educationDegreeId +
                ", divisionId=" + divisionId +
                ", userName=" + userName +
                '}';
    }
}
