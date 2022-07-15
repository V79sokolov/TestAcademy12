package home_work_1;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input number: ");
        int resalt = number1.nextInt(); //инициализируем введенное значение для числа
        System.out.println(Integer.toBinaryString(resalt));

        Scanner obj = new Scanner(System.in);
        System.out.print("Total number of elements: ");
        resalt = obj.nextInt();
        int[] array = new int[8];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < resalt; i++) {
            array[i] = obj.nextInt(); //reads elements from the user
        }
        System.out.println("Array elements you entered are: ");
        for (int i = 0; i < resalt; i++) {
            System.out.println(array[i]);

            for (int k = array.length - 1; k >= 0; k--) {

            }
        }
    }}