package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /**
     * метод возведенеия в степень числа
     * @return озвращает результат возведенеия в степень
     */
    public double degree(double a5, double b5) {
        double resultDegree=Math.pow(a5, b5);
        return resultDegree;
    }
//          double result5=Math.pow(a5,b5);
    /**
     * метод получения модуля числа
     * @return озвращает результат модуля числа
     */
    public double module(double a6) {
        double resultModule=Math.abs(a6);
        return resultModule;
    }

    /**
     * метод получения квадратного корня из числа
     * @return озвращает результат
     */
    public double squareNumber(double a7) {
        double resultSquareNumber=Math.sqrt(a7);
        return resultSquareNumber;
    }
}

