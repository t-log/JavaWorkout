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
        multiply(10.5f,5.5f);
        multiply(5.5f,10);
    }
}
