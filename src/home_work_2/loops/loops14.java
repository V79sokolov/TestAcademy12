package home_work_2.loops;

import java.util.Scanner;// импорт класса  Scanner

import java.lang.Integer;// импорт класса  Integer

public class loops14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // создаём объект класса Scanner
        System.out.println("Введите  целое число");
        int num = input.nextInt();
        int a = 1;
        int b = Integer.MAX_VALUE / num; // b = Integer.MAX_VALUE масимально возможное значение числа с типом int 2 147 483 647
        System.out.println("Максимально возможно значение числа а с типом Long до переполнения " + Integer.MAX_VALUE);
        System.out.println("Сколько раз нужно повторить умножение числа а для получения переполнения: " + b);
        int res = 1;
            for (int i = 1; i <= b; i++) {
            res = res * i;
            System.out.print(i);
            if (i < b)
                System.out.print("*");
        }
        System.out.println("=" + res);
        int per=res*(b+1);
        System.out.println("Если вы умножите на один раз больше  то получим переполненение: " + per);

    }
}



