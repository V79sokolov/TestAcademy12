package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice41 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
            System.out.print("Input number: ");
        int resalt = number.nextInt(); //инициализируем введенное значение для числа

            if (resalt % 2 == 0) {
            System.out.println("Данное число " + resalt + " является четным");
        } else {
            System.out.println("Данное число " + resalt + " не является четным");




        }
    }
}


