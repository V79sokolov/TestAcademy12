package home_work_2.loops;

import java.util.Scanner; // импорт класса Scanner

public class loops12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // создаём новый объект класса Scanner
        System.out.println("Введите  целое число");
        int num = input.nextInt();//получение значения input из консоли  иприсваевание этого значения переменной num тип int

            System.out.println("Введено не число");
        int res = 1;
        for (int i = 1; i <= num; i++) {
        res = res * i;
            System.out.print(i);
            if (i < num)
            System.out.print("*");
        }
            System.out.print("=" + res);

            if (input.hasNextInt()) {
                // Определяем, является ли ввод целым числом
            int i = input.nextInt();
                // получаем целое число
                System.out.println("Вы ввели целое число:" + i);
            } else {
                // Ввод неверной информации
                System.out.println("Введено не целое число!");
            }
            if (input.hasNextLine()) {
                System.out.println("Введено не число");
            }
        }
    }
