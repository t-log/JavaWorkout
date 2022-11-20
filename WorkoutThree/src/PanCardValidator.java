import java.util.Scanner;

class withInvalidPanException extends Exception{
    withInvalidPanException(String msg){
        super(msg);
    }
}
public class PanCardValidator {
    String cardNo;
    String name;
    Scanner sc = new Scanner(System.in);

    PanCardValidator(){
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter 10-digit Card No:");
        cardNo = sc.nextLine();
    }
    public static void main(String[] args) {
        PanCardValidator p1 = new PanCardValidator();
        try {
            if(p1.name.charAt(0) != p1.cardNo.charAt(6)){
                throw new withInvalidPanException("Exception:Invalid Pan no");
            }
            else{
                System.out.println("Valid Pan card");
            }
        }
        catch (withInvalidPanException e){
            System.out.println(e.getMessage());
            System.out.println("Please enter correct number");
        }


    }
}
