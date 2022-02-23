package ss8_clean_code.thuc_hanh.refactoring;

public class CalculatorService {
    public int additionOperand(int firstOperand, int secondOperand){
        return firstOperand+secondOperand;
    }
    public int subtractionOperand(int firstOperand, int secondOperand){
        return firstOperand-secondOperand;
    }
    public int multiplicationOperand(int firstOperand, int secondOperand){
        return firstOperand*secondOperand;
    }
    public int divisionOperand(int firstOperand, int secondOperand){
        if (secondOperand != 0) {
            return firstOperand / secondOperand;
        }
        else {
            throw new RuntimeException("Can not divide by 0");
        }
    }


}
