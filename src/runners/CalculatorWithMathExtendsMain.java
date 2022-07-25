package runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculatorWithMathExtends=new CalculatorWithMathExtends();
        double resultMultiplication = calculatorWithMathExtends.multiplication(15.0, 7.0);
        double resultDivision =calculatorWithMathExtends.division(28.0, 5.0);
        double resultDegree=calculatorWithMathExtends.degree(resultDivision,2.0);
        double resultAddition = calculatorWithMathExtends.addition(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);

    }
}
