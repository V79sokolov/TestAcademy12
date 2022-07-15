package home_work_1;

public class Practice7 {
    public static void main(String[] args) {

        int[] array = new int[10];//формула для определения границ "double d = Math.random() * (max - min) + min";
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10 - 0) + 0);// для наполнения массива используем метод Math.random с границами совестно с циклом
            System.out.println(array[i]);// выводим наш массив из рандомных чисел в диапозоне от 0 до 10


            public static String createPhoneNumber(int[] numberR) {
                String forma = "(xxx) xxx-xxxx";// формат в котором нужно вывести номер телефона

                for (int k = 0; k < numberR.length; k++) // для вывода информации используем цикл
                {
                    forma = forma.replace("x", numberR[k] + " ");
                    System.out.println(forma);// вывод рандомного номера в нужном формате
                }
            }
        }
    }
}


//Прошу расмотреть этот  вариант  - вопрос в 12 строке

