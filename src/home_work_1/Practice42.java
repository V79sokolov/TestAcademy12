package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Branching43 {
    public static void main(String[] args) {

        Scanner number1 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
          System.out.print("Input number1: ");
            int resalt1 = number1.nextInt(); //инициализируем введенное значение для первого числа

        Scanner number2 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
          System.out.print("Input number2: ");
            int resalt2 = number2.nextInt(); //инициализируем введенное значение для второго числа

        Scanner number3 = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
           System.out.print("Input number3: ");
             int resalt3 = number3.nextInt(); //инициализируем введенное значение для третьего числа

        System.out.println("Input numbers " + resalt1 + " " + resalt2 + " " + resalt3);

        if (resalt1 > resalt2 && resalt1 < resalt3) { //если какокое то число больше одного но меньше другого то оно будет средним
            System.out.println("Данное число " + resalt1 + " будет  средним числом");
        } else {
            if (resalt2 > resalt1 && resalt2 < resalt3) {
                System.out.println("Данное число " + resalt2 + " будет средним числом");
            } else {
                System.out.println("Данное число " + resalt3 + " будет средним числом");
            }
        }
    }
}



