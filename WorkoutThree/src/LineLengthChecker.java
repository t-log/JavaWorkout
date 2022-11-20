import java.util.Scanner;

public class LineLengthChecker {
    void lengthCheck(String s)
    {
        try {
            if(s.length()>10){
                throw new ExceptionLineTooLong("Line is too long!!!");
            }
            else if(s.length()<5){
                throw new ExceptionLineTooShort("Line is too short!!!");
            }
            else
                System.out.println("Correct length");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    public static void main(String[] args) {
        String line = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line");
        line = sc.nextLine();
        LineLengthChecker l = new LineLengthChecker();
        l.lengthCheck(line);


    }
    class ExceptionLineTooLong extends Exception{
        ExceptionLineTooLong(String msg){
            super(msg);
        }
    }
    class ExceptionLineTooShort extends Exception{
        ExceptionLineTooShort(String msg){
            super(msg);
        }
    }
}
