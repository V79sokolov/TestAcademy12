package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice44 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input number: ");
        double resalt = number.nextDouble(); //инициализируем введенное значение для первого числа

        Scanner answer = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.print("Input answer ");
        String answ = answer.nextLine().toLowerCase();; //инициализируем введенное значение для второго числа toLowerCase() перевод ответа в нижний регистр
        double resalt2=resalt/1024;
        double c = Math.round(resalt2); // округление до 5 знаков  - но но могу понять почему  выводит 00
                if (answ == "да"|| answ == "yes") {
            System.out.println(resalt+ " kbyte is " + c + " bit");
        } else {
            System.out.println(resalt+ " bit is " + (resalt*1024) + " kbyte");
        }
    }
}



