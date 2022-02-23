package ss8_clean_code.thuc_hanh.refactoring;

public class CalculatorSmellCode {
    public static int calculate(int firtsOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firtsOperand + secondOperand;
            case '-':
                return firtsOperand - secondOperand;
            case '*':

                return firtsOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firtsOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}

