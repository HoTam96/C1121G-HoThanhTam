package ss8_clean_code.thuc_hanh.refactoring;

public class Model {
    private int firstOperand;
    private int secondOperand;
    private char operator;

    public Model(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public Model(int firtsOperand, int secondOperand, char operator) {
        this.firstOperand = firtsOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

}
