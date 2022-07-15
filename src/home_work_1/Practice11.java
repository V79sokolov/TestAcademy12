package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice {
    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input number1: ");
        int resalt1 = number1.nextInt(); //инициализируем введенное значение для числа

        Scanner number2 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input number2: ");
        int resalt2 = number2.nextInt(); //инициализируем введенное значение для числа

        System.out.println(Integer.toBinaryString(resalt1));
        System.out.println(Integer.toBinaryString(resalt2));
        int a=resalt1;
        int b=resalt2;
        int resalt=a/b;
        System.out.println(Integer.toBinaryString(resalt));
    }
    }

