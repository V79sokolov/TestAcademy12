package home_work_1;
import java.util.Objects;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        String name = scan.nextLine(); // пользователь вводит имя которое в дальнейнем будет проверятся
        if (Objects.equals(name, "Вася")){ //Если введенное имя совпадает с "Вася" (true) то будет выводится сообщение Привет! Я тебя должго ждал!
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (Objects.equals(name,"Анастасия")){
            System.out.println("Я тебя так долго ждал");//Если введенное имя совпадает с "АНастасия"  (true) то будет выводится сообщение  Я тебя должго ждал!
        }
        if (!Objects.equals(name, "Вася") && !Objects.equals(name,"Анастасия")){ // если обо условия будут false то...
            System.out.println("Добрый день а Вы кто?");// будет выведено сообщение "Добрый день а Вы кто?"
        }
    }
}



