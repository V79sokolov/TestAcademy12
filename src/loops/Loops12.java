package loops;

import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args){

         Scanner in = new Scanner(System.in);
             System.out.println("Введите число");
         int num = in.nextInt();
         int result = 1;
         for (int i = 1; i <= num; i++) {
         result=result*i;
             System.out.print(i);
             if (i<num)
                 System.out.print("*");}
                 System.out.print("="+result);
             if (result < 0) {
                 System.out.println(" Произошло переполнение");
         }
    }
}
