package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Practice5 {

        public static boolean sleepIn(boolean weekday, boolean vacation) {// создаем метод static boolean sleepIn(boolean weekday, boolean vacation)
            if (!weekday || vacation) {
                return true;      // условие когда будет true  а когда false
                } else {
                        return false;
    }
}
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

                System.out.println("У Вас сегодня будний день? Да или Нет?");// запрос  с примененние метода toLowerCase() - что позволит вводить ответ в любом регистре
                String wDay = console.next().toLowerCase();

                     System.out.println("Вы в отпуске? Да или Нет?");// запрос  с примененние метода toLowerCase() - что позволит вводить ответ в любом регистре
                     String vac = console.next().toLowerCase();

                          boolean weekday = wDay.equals("да");// инициализируем перменную weekday булевого типа  с использование метода equals() - будет сравнивать эту строку с ответом введенным в консоли String wDay = console.next().toLowerCase();
                          boolean vacation = vac.equals("да");// инициализируем перменную vacation перменную булевого типа с использование метода equals() - будет сравнивать эту строку с ответом введенным в консоли String vac = console.next().toLowerCase();

            if (sleepIn(weekday, vacation)) {
                System.out.println("Можешь спать дальше :)");// будет выводится такой ответ если true
                } else {
                     System.out.println("Пора идти на работу :(");// будет выводится такой ответ если false
        }
    }
}