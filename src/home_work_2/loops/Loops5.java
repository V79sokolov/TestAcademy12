package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loops5<maxnumber> {
    public static void main(String[] args) {


  //
   //     System.out.println("Переворот числа");

         {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите число");
            String num = console.nextLine();
            int max, min, t = Math.abs(Integer.parseInt(num)), maxCount = 0, minCount = 0;
            max = min = t % 10;
            while (t > 0) {
                if (max < t % 10) max = t % 10;
                if (min > t % 10) min = t % 10;
                t = t / 10;
            }

            System.out.println("Наибольшая цифра = " + max + " Наименьшая цифра =" + min);
         }
    }




    public static int res2(){
    int res2 = 0;
    int[] array = new int[200];
    Random x = new Random();
        for (int i = 0; i < 200; i++) {
        array[i] = x.nextInt();
        if (array[i] % 2 == 0) {
        res2 += 1;
        }
        }
        System.out.println("Вероятность четных случайных чисел");
        return res2;
        }




     public static String   res3() {
         int[] array = new int[200];
         Random x = new Random();
         for (int i = 0; i < 200; i++) {
             array[i] = x.nextInt();
             int n = 0;
             int m = 0;
             for (int k = 0; k < array.length; k++) {
                 if (array[k] % 2 == 0) {
                     // Записываем четное число
                     n++;
                 } else {
                     // Записываем нечетное число
                     m++;
                 }
             }
             System.out.println("Посчитать четные и не четные цифры числа");
             System.out.println("четное число:" + n + "штука");
             System.out.println("нечетное число:" + m + "штука");
         }


         /**
          *
          *
          * @param n колисчество чисел в ряду
          * @return
          */
        // private static int Finobachi () {
             int n = 0;
             int firstnumber = 0;
             int secondnumber = 1;
             int res4;
             res4 = n;
             for (int i = 1; i < n; i++) {
                 res4 = firstnumber + secondnumber;
                 firstnumber = secondnumber;
                 secondnumber = res4;
             }
             return String.valueOf(res4);
             //      System.out.println("Ряд Фибоначи:"+String.valueOf(res4));
         }



         Scanner console = new Scanner(System.in);
         String res5;
         System.out.println("Максимум диапозона. Введите число");
         int maxnumber = console.nextInt();
         System.out.println("Введите шаг");
         int step = console.nextInt();
         int min;
         int count = min;
         while (count < maxnumber) {
             count += step;
             res5 = "" + count;
             return res5;
         }
     }



          public static String reverseNumber () {
              int num = 11322,
                      reversed = 0;
              while (num != 0) {
                  int digit = num % 10;
                  reversed = reversed * 10 + digit;
                  num /= 10;
              }
              return String.valueOf(reversed);
     }
}

