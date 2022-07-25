package runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
    double a=4.1;
        double b1=15.0;
        double b2=7.0;
        double res1 = b1*b2;
        double c1=28;
        double c2=5;
        double res=c1/c2;
        int p=2;
        double result= a+(b1*b2)+ (Math.pow(res,p));
 //     double result=4.1+(15*7)+Math.pow((28/5),2);
        System.out.println(result);

        }
    }
