package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration {

           public static void main(String[] args) {
            printAllFor();
            System.out.println();
            printAllDoWhile();
            System.out.println();
            printAllWhile();
            System.out.println();
            printAllForeach();
            System.out.println();
            printEverySecondFor();
            System.out.println();
            printEverySecondDoWhile();
            System.out.println();
            printEverySecondWhile();
            System.out.println();
            printEverySecondForeach();
            System.out.println();
            printReverseFor();
            System.out.println();
            printReverseDoWhile();
            System.out.println();
            printReverseWhile();
            System.out.println();
            printReverseForeach();
        }

        /*Метод вывода  элементов массива через цикл  for
        *
        * */
        public static void printAllFor() {
            System.out.println("Метод вывода  элементов массива через   for цикл ");
            int[]array = ArrayUtils.arrayFromConsole();
            for (int i = 0; i<array.length; i++) {
                System.out.print(array[i]+ " ");
            }
        }

        /*Метод вывода  элементов массива черз do while - выполняется хотя бы раз а потом работает условие
        *
        * */
        public static void printAllDoWhile() {
            System.out.println("Метод вывода  элементов массива черз do while");
            int[]array = ArrayUtils.arrayFromConsole();
            int i = 0;
            do {
                System.out.print(array[i]+ " ");
                i++;
            }
            while (i<array.length);
        }

        /*Метод вывода  элементов массива через  while do
        *
        * */
        public static void printAllWhile() {
            System.out.println("Метод вывода  элементов массива через  while do");
            int[]array = ArrayUtils.arrayFromConsole();
            int i = 0;
            while (i<array.length){
                System.out.print(array[i]+ " ");
                i++;
            }
        }

        /*Метод вывода  элементов массива через 'foreach' цикл
        *
        * */
        public static void printAllForeach() {
            System.out.println("Метод вывода  элементов массива через 'foreach' цикл");
            int[]array = ArrayUtils.arrayFromConsole();
            for (int element:array) {
                System.out.print(element + " ");
            }
        }

        /*Метод вывовода каждого второго элемента массива
        *
        * */

        public static void printEverySecondFor(){
            System.out.println("Метод вывовода каждого второго элемента массива через for");
            int[]array = ArrayUtils.arrayFromConsole();
            for (int i = 0; i<array.length; i++) {
                System.out.print(array[i+1] + " ");
            }
        }

        /*Метод вывовода каждого второго элемента массива через do while
        *
        * */

        public static void printEverySecondDoWhile(){
            System.out.println("Метод вывовода каждого второго элемента массива через do while");
            int[]array = ArrayUtils.arrayFromConsole();
            int i = 1;
            do {
                System.out.print(array[i] + " ");
                i+=2;
            } while (i<array.length);
        }

        /*Метод вывовода каждого второго элемента массива через while
        *
        * */

        public static void printEverySecondWhile(){
            System.out.println("Метод вывовода каждого второго элемента массива через while");
            int[]array = ArrayUtils.arrayFromConsole();
            int i = 1;
            while (i<array.length){
                System.out.print(array[i] + " ");
                i+=2;
            }
        }


        /*Метод вывовода каждого второго элемента массива через'foreach'
        *
        * */

        public static void printEverySecondForeach(){
            System.out.println("Метод вывовода каждого второго элемента массива через'foreach' ");
            int[]array = ArrayUtils.arrayFromConsole();
            int count = 1;

            for (int element:array){
                if (count % 2 == 0) {
                    System.out.print(element + " ");
                }
                count++;
            }
        }

        /*Метод замены/переворота элементов масива 'for'
        *
        * */

        public static void printReverseFor(){
            System.out.println("Метод замены/переворота элементов масива 'for");
            int[]array = ArrayUtils.arrayFromConsole();
            for (int i = array.length-1; i>=0; i--) {
                System.out.print(array[i] + " ");
            }
        }

        /*Метод замены/переворота элементов масива 'do while'
        *
        * */

        public static void printReverseDoWhile(){
            System.out.println("Метод замены/переворота элементов масива 'do while'");
            int[]array = ArrayUtils.arrayFromConsole();
            int i = array.length-1;
            do {
                System.out.print(array[i] + " ");
                i--;
            }while (i>=0);

        }

        /* Метод замены/переворота элементов масива'while' do
        *
        *  */

        public static void printReverseWhile() {
            System.out.println("Метод замены/переворота элементов масива'while' do");
            int[] array = ArrayUtils.arrayFromConsole();
            int i = array.length - 1;
            while (i >= 0) {
                System.out.print(array[i] + " ");
                i--;
            }
        }


        /*Метод замены/переворота элементов масива'while' do'foreach'
        *
        *  */

        public static void printReverseForeach() {
            System.out.println("Метод замены/переворота элементов масива'while' do'foreach'");
            int[] array = ArrayUtils.arrayFromConsole();
            int[] arrayFinal = new int[array.length];
            int i = array.length - 1;

            for (int element : array) {
                arrayFinal[i] = element;
                i--;
            }
            for (int element : arrayFinal) {
                System.out.print(element + " ");
            }
        }

    }

}
