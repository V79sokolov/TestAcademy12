package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice61 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
            System.out.print("Введите имя: ");
                 String s = in.nextLine();
                 switch (s){
                 case "Имя  - Вася":
                    System.out.println("Привет!");
                    System.out.println("Я тебя так долго ждал");
                    break;// оператор прерывания
                 case "Имя - Анастасия":
                     System.out.println("Я тебя так долго ждал");
                     break;// оператор прерывания

                        default:// дефольная часть аогоритма если введеное имя  соответствует
                        System.out.println("Добрый день, а вы кто?");
            }
    }
}


