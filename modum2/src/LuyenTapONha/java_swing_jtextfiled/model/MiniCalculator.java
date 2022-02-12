package LuyenTapONha.java_swing_jtextfiled.model;

public class MiniCalculator {
    private double firstValue;
    private double secondValue;
    private double answer;

    public MiniCalculator(double firstValue, double secondValue, double answer) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.answer = answer;
    }

    public MiniCalculator() {
    }

    public double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus() {
        this.answer = this.firstValue + this.secondValue;
    }

    public void minus() {
        this.answer = this.firstValue - secondValue;
    }

    public void multiply() {
        this.answer = this.firstValue * this.secondValue;
    }

    public void divide() {
        this.answer = this.firstValue / this.secondValue;
    }

    public void pow() {
        this.answer = Math.pow(this.firstValue, this.secondValue);
    }

    public void mod() {
        this.answer = this.firstValue % this.secondValue;
    }
}
