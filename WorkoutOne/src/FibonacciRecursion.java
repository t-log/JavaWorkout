import java.util.Scanner;

public class FibonacciRecursion {
    public static int fib(int count)
    {
        if (count ==1 || count==2)
        {
            return count-1;
        }
        return fib(count-1)+fib(count-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit for series:");
        int count = sc.nextInt();
        for (int i=1;i<=count;i++)
        {
            System.out.print(fib(i) + " ");
        }
    }
}
