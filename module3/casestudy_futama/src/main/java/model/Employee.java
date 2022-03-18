package model;

public class Employee extends Person {
    private Integer employeId;
    private double salary;
    private Integer positionId;
    private Integer educationDegreeId;
    private Integer divisionId;
    private String userName;

    public Employee(Integer employeId, double salary, Integer positionId, Integer educationDegreeId, Integer divisionId, String userName) {
        this.employeId = employeId;
        this.salary = salary;
        this.positionId = positionId;
        this.educationDegreeId = educationDegreeId;
        this.divisionId = divisionId;
        this.userName = userName;
    }

    public Employee() {
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

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getEducationDegreeId() {
        return educationDegreeId;
    }

    public void setEducationDegreeId(Integer educationDegreeId) {
        this.educationDegreeId = educationDegreeId;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeId=" + employeId +
                ", salary=" + salary +
                ", positionId=" + positionId +
                ", educationDegreeId=" + educationDegreeId +
                ", divisionId=" + divisionId +
                ", userName='" + userName + '\'' +
                '}';
    }

}
