package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    /**
     * метод сложение
     * @return озвращает результат сложения чисел
     */
    double addition(double a1, double b1) {
        double result1 = a1 + b1;
        return result1;
    }

        /**
         * метод деления
         * @return озвращает результат делкния чисел
         */
        double division(double a2, double b2){
            double result2 = a2 / b2;
            return result2;
        }

            /**
             * метод вычитания
             * @return озвращает результат делeния чисел
             */
            double subtraction(double a3, double b3){
                double result3=a3-b3;
                return result3;

            }

    /**
     * метод умножения
     * @return озвращает результат умножения чисел
     */
        double multiplication(double a4, double b4) {
            double result4=a4*b4;
            return result4;}


            /**
             * метод возведенеия в степень числа
             * @return озвращает результат возведенеия в степень
             */
            double degree(double a5, double b5) {
                double result5=Math.pow(a5,b5);
                return result5;
        }

    /**
     * метод получения модуля числа
     * @return озвращает результат модуля числа
     */
    double module(double a6) {
        double result6 = Math.abs(a6);
        return result6;
    }

    /**
     * метод получения квадратного корня из числа
     * @return озвращает результат
     */
    double squareNumber(double a7) {
        double result7 = Math.sqrt(a7);
        return result7;
    }
}