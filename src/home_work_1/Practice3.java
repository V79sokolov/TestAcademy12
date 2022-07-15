package home_work_1;

public class Practice3 {
    public static void main(String[] args) {
        // 3.1 нахождение корня из числа
        int x=9;
        System.out.println(Math.sqrt(x));// метод sqrt

           // 3.2 вызов значения числа ПИ
           System.out.println(Math.PI);

              // 3.3 возведения числа а  в степень b
              long a=3;
              long b=3;
              System.out.println(Math.pow(a,b)); //метод  pow

                  // 3.4 нахождение максимального числа из двух чисел
                  int a2=3;
                  int b2=25;
                  System.out.println(Math.max(a2,b2)); // метод max

                       //3.5 нахождение минимального числа из двух чисел
                       int a3=3;
                       int b3=25;
                       System.out.println(Math.min(a3,b3)); // метод min

                           //3.6 нахождение синуса угла a=30градусов
                           double a4=30;// на с интересует угол зо градусов
                           double radian = Math.toRadians(a4);// можно было и так:  double radian = Math.toRadians(30);  используем метод toRadians() дчто бы  наш угол 30 градусов перевести в радианы т.к. изночально библиотека Math ожидает что значения любой тригонометрической функции будет в  радиананах
                           System.out.println(Math.sin(radian)); // находим синус 30 градусов


                               // 3.7 нахождение кубического корня из числа
                                double x2=27;
                                System.out.println(Math.cbrt(x2));// метод sqrt

                                    // 3.8 генерация рандомного числа от 0 до единицы
                                    System.out.println(Math.random());// метод random

                                        // 3.9 округление числа
                                        double x3=2.7;
                                        System.out.println(Math.round(x3)); // метод random

                                            // 3.10 Нахождение модуля числа
                                            System.out.println(Math.abs(-4)); // использован метод abs для нахождения модуля числа -4
    }
}
