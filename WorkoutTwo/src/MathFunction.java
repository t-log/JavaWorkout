import java.util.Scanner;

public class MathFunction {
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
    static void multiply(float a,float b){
        System.out.println(a*b);
    }
    static void multiply(float a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        multiply(5,2);
        multiply((float)10.5,(float)5.5);
        multiply((float)5.5,10);
    }
}
