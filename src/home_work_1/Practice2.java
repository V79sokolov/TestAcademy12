package home_work_1;

public class Priority {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=8;
        //2.1
        int resalt1=a+b/c;
        System.out.println(resalt1); // 5,   5+ (2/8)=5+0(целая часть от деления 0)

            //2.2
            int resalt2=(a + b)/c;
            System.out.println(resalt2); // 0,  (5+2)/8=7/8=0  (целая часть отделения 0)

               //2.3
               int resalt3=(a + b++)/c;
               System.out.println(resalt3); // 0,  ( 2+5)/8=0 (целая часть отделения 0)

                //2.4
                int resalt4=(a + b++)/--c;
                System.out.println(resalt4); // 1,  ( 2+5)/7=1

                    //2.5
                    int resalt5=(a*b>>a++)/--c;
                    System.out.println(resalt5); // 0, >> - побитовый оператор но ни как не для простых чисел. Для корректной обработки нужно использовать метод Integer.toBinaryString()

                        //2.6
                        int resalt6=(a+b>20 ? 68:22*a>>a++)/--c; // побитовый оператор но ни как не для простых чисел.
                        System.out.println(resalt6); // 0,

                            //2.7
                            int resalt7=(a+b>20 ? 68:22*a>>a++)/--c; // побитовый оператор но ни как не для простых чисел.
                            System.out.println(resalt7); // 0,

                                //2.8
                          //      int resalt8=6-a>&&12*12<=119;  //не скомпилируется т.к. условие длжно быть вида "а<=какое то значение<=b" и 12*12  это 14 что больше и не равно 119
                         //       System.out.println(resalt8);

                                     //2.9
                                     boolean resalt9=true&&false;
                                     System.out.println(resalt9); // false, по идее должно быть или true или false - по умолчанию выводит  false
    }
}
