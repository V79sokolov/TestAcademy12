package home_work_2.loops;

public class loops6 {
    public static void main(String[] args) {
        System.out.println("Таблица умножения" );
        for (int i = 1; i <=10; i++) {   // внешний цикл для  вывода  строк с 1 по 10
            for (int j = 1; j < 5; j++) { // внутренный цикл для  вывода  столбцов с 1 по 5
                System.out.print(j + "*" + i + "=" + (j * i) + "\t");
            }
            System.out.print("\n");// табыляци что бы столбцы были ровными
        }
            System.out.println();
            for (int i = 1; i <=10; i++) {// внешний цикл для  вывода  строк с 1 по 10
                for (int j = 6; j <=9 ; j++) {// внутренный цикл для  вывода  столбцов с 6 по 10
                    System.out.print(j+ "*"+ i+"="+(j*i)+ "\t");
                }
                System.out.print("\n");
        }
    }
}
