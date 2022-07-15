package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Branching42 {
    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
           System.out.print("Input number1: ");
        int resalt1 = number1.nextInt(); //инициализируем введенное значение для первого числа

        Scanner number2 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
            System.out.print("Input number2: ");
        int resalt2 = number2.nextInt(); //инициализируем введенное значение для второго числа

            System.out.println("Input numbers "+ resalt1 +" "+ resalt2);

            if (resalt1%resalt2==0) {                                                    // если остаток от деления равене нулю то...
                 System.out.println("Данное число "+resalt1+" делится на число "+resalt2);
                 } else {                                                                  // иначе ....
                     System.out.println("Данное число " + resalt1 + " не делится без остатка на  " + resalt2);
                 }
        }
}



