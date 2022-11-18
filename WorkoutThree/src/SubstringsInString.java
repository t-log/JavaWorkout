import java.util.Scanner;

public class SubstringsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = new String(sc.next());
        for (int i =0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                System.out.println(s.substring(i,j+1));
            }
        }
    }
}
