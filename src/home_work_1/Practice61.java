package home_work_1;
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String s = in.nextLine();
            switch (s){
                case "Имя  - Вася":
                    System.out.println("Привет!");
                    System.out.println("Я тебя так долго ждал");
                    break;
                case "Имя - Анастасия":
                    System.out.println("Я тебя так долго ждал");
                    break;
                default:
                    System.out.println("Добрый день, а вы кто?");
            }
        }
    }
    }
}
