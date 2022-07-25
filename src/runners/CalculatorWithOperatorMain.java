package runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator сalculatorWithOperator=new CalculatorWithOperator();
        double resultMultiplication = сalculatorWithOperator.multiplication(15.0, 7.0);
        double resultDivision =сalculatorWithOperator.division(28.0, 5.0);
        double resultDegree=сalculatorWithOperator.degree(resultDivision,2.0);
        double resultAddition = сalculatorWithOperator.addition(resultMultiplication,resultDegree);
        double result=4.1+resultAddition;
        System.out.println(result);
    }
}
