import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low,high;
        System.out.println("Enter lower and upper limits:");
        low=sc.nextInt();
        high=sc.nextInt();
        for (int i=low+1;i<high;i++)
        {
            if (Math.sqrt(i)==(int)Math.sqrt(i))
                System.out.print(i+ " ");
        }
    }
}
