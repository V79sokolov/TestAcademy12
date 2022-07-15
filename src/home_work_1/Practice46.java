package home_work_1;
import java.util.Scanner;// импортируем класс Scanner так как этот класс заранее не импортирован из пакета java.util в отличие от того же String
public class Branching45 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in); //создаем объект в классе Scanner и в параметрах класса  Scanner создаем входной поток System.in
        System.out.println("Введите год:");
        long year = number.nextLong();// инициализируем введенное значение для числа
        if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0){  //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400. Высокостным годом является целое число, которое удовлетворяет двум условиям: его можно назвать високосным годом. Во-первых, его можно разделить на 4, но не на 100
            System.out.println(year + " - високосный год!");
        }else{
            System.out.println(year + " - не високосный год!");

        }

}
}


