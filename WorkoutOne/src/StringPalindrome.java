import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        String s;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        s = sc.next().toLowerCase();
        for (int i=0;i<s.length()/2;i++)
        {
            if (s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                flag = false;
                break;
            }
        }
        if (flag==false)
            System.out.println("Not palindrome");
        else
            System.out.println("Palindrome");
    }
}
