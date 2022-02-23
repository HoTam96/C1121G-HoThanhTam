package ss8_clean_code.thuc_hanh.refactoring;

import java.awt.*;
import java.util.Scanner;

public class MainCaculator {

    public static void main(String[] args) {
        int luaChon = 1;
        Scanner sc = new Scanner(System.in);
        CalculatorService calculatorService = new CalculatorService();


        do {
            System.out.println(" ---------addOperand-----------");
            System.out.println("addFirstOperand");
            int firstOperand = sc.nextInt();
            System.out.println("addSecondOperand");
            int secondOperand = sc.nextInt();
            System.out.println("-------------Menu----------------");
            System.out.println("1. cộng  2 toán tử\n" +
                    "2. trừ 2 toán tử\n" +
                    "3. nhân 2 toán tử\n" +
                    "4. chia 2 toán tử\n" +
                    "0. để thoát");
            luaChon = sc.nextInt();

            switch (luaChon) {

                case 1:

                    System.out.println( calculatorService.additionOperand(firstOperand, secondOperand));
                    break;
                case 2:
                    System.out.println(calculatorService.subtractionOperand(firstOperand, secondOperand));
                    break;
                case 3:
                    System.out.println(calculatorService.multiplicationOperand(firstOperand, secondOperand));
                    break;
                case 4:
                    System.out.println( calculatorService.divisionOperand(firstOperand, secondOperand));
                    break;
                default:
                    throw new RuntimeException("Unsupported operation");
            }

        } while (luaChon != 0);


    }

}
