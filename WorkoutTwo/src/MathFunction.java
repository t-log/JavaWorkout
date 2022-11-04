import java.util.Scanner;

public class MathFunction {
    static int multiply(int a,int b){
        return a*b;
    }
    static float multiply(float a,float b){
        return a*b;
    }
    static float multiply(float a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        int num1,num2;
        float num3,num4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers to multiply:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Result:"+ multiply(num1,num2));
        System.out.println("Enter two floating point numbers to multiply:");
        num3 = sc.nextFloat();
        num4 = sc.nextFloat();
        System.out.println("Result:"+ multiply(num3,num4));
        System.out.println("Enter int and float numbers to multiply:");
        num1 = sc.nextInt();
        num3 = sc.nextFloat();
        System.out.println("Result:"+ multiply(num1,num3));

    }
}
