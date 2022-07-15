package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice11 {
    public static void main(String[] args) {
        // раз не получается  ввести единным числом то  число 42.5 можно представить как 425/10
        Scanner number1 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input number1: ");
        int resalt1 = number1.nextInt(); // пользователь будет вводить  число 425

             Scanner number2 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
             System.out.print("Input number2: ");
             int resalt2 = number2.nextInt(); // пользователь будет вводить число 10

                  System.out.println(Integer.toBinaryString(resalt1));  // вывод числа 245 в двоичной СИ
                  System.out.println(Integer.toBinaryString(resalt2));  // вывод числа 10 в двоичной СИ
        int a=resalt1;
        int b=resalt2;
        int resalt=a/b; // оператор деления
        System.out.println(Integer.toBinaryString(resalt)); // вывод результата в двоичной СИ
    }
    }

