package runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calculatorWithMathCopy=new CalculatorWithMathCopy();
        double resultMultiplication = calculatorWithMathCopy.multiplication(15.0, 7.0);
        double resultDivision =calculatorWithMathCopy.division(28.0, 5.0);
        double resultDegree=calculatorWithMathCopy.degree(resultDivision,2.0);
        double resultAddition = calculatorWithMathCopy.addition(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);
    }
}
