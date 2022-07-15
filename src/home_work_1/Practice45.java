package home_work_1;
import java.util.Scanner;
public class Practice45 {

        public static void main(String[] args) {
            Scanner number = new Scanner(System.in);//создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
            System.out.print("Input: ");
            int resalt = number.nextInt(); //инициализируем введенное значение для числа
            if (resalt%2!=0) {
                System.out.print("Вы ввели число "+ resalt);
            } else {
                System.out.print("Вы ввели символ "+ resalt);
            }

        }
    }

