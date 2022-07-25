package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {


        /**
         * метод сложение
         * @return озвращает результат сложения чисел
         */
        public double addition(double a1, double b1) {
            double resultAddition = a1 + b1;
            return resultAddition;
        }

        /**
         * метод деления
         * @return озвращает результат деления чисел
         */
        public double division(double a2, double b2){
            double resultDivision =a2/b2;
            return resultDivision;
        }

        /**
         * метод вычитания
         * @return возвращает результат вычитания чисел
         */
        public double subtraction(double a3, double b3){
            double resultSubtraction=a3-b3;
            return resultSubtraction;

        }

        /**
         * метод умножения
         * @return озвращает результат умножения чисел
         */
        public double multiplication(double a4, double b4) {
            double resultMultiplication=a4*b4;
            return resultMultiplication;}


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

