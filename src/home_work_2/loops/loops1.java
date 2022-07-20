package home_work_2.loops;

import java.util.Scanner;

public class loops1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
                System.out.print(i);
                if (i < num)
                    System.out.print("*");
            }
            System.out.print("=" + result);
            if (result < 0) {
                System.out.println(" Произошло переполнение");
                int count = 1;
                for (int j = 1; j <= num - 1; j++) {
                    count = count * j;}
                System.out.println(" До переполнения: " + count);

        }
    }
}
