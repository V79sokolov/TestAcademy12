package home_work_1;
import java.util.Objects;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String

public class Practice62 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Как тебя зовут");
            String name = scanner.next();// пользователь вводит имя которое в дальнейнем будет проверятся


            if (Objects.equals(name,"Вася")) { // Если введенное имя совпадает с "Вася" (true) то будет выводится сообщение Привет! Я тебя должго ждал!
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
            } else {
                if (Objects.equals(name,"Анастасия")) { // иначе  проверяется  на сопадение введеного имени с "Анастасия"

                    System.out.println("Я тебя так долго ждал");

                } else {
                    System.out.println("Добрый день, а вы кто?");// будет выводится такое сообщение, если нет совпадений ни с первым именем и не со вторым

                }
            }
        }
    }

