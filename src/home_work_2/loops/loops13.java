package home_work_2.loops;

import java.text.DecimalFormat;

import java.util.Scanner;

public class loops13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Введите  число которое нужно возвети в степень");
        double a = input.nextDouble();//получение значения input из консоли  иприсваевание этого значения переменной a тип Double дробный
        Scanner input2 = new Scanner(System.in);
            System.out.println("Введите  значение степени");
        double b = input2.nextDouble();//получение значения input2 из консоли  иприсваевание этого значения переменной b тип Double дробный
        double res = 1;
        if (b % 1 > 0 && b<0) {System.out.println("Степень должно быть целым  и не отрицательным числом");}
            for (int i = 1; i <= b; i++) {
                res = res * a;
            }
        System.out.println(a + "^"+b + "=" + (new DecimalFormat("###,###.##").format(res))); // вывод результата в формате "###,###.##"
    }
    }



