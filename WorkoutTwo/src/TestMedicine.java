import java.util.Random;
import java.util.Scanner;

class Medicine{
    private String companyName,companyAddress;
    Scanner sc = new Scanner(System.in);
    Medicine(){
        System.out.println("Enter Company Name & Address:");
        companyName = sc.nextLine();
        companyAddress = sc.nextLine();
    }
    public void displayLabel(){
        System.out.println("Company Name:" + companyName + '\n'
                +"Company Address:" + companyAddress);
    }
}
class Tablet extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("Store in a cool & dry place");
    }
}
class Syrup extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("Dosage as recommended by doctor");
    }
}
class Ointment extends Medicine{
    public void displayLabel(){
        super.displayLabel();
        System.out.println("For External use only");
    }
}
public class TestMedicine {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        for (int i=0;i<3;i++){
            randomNumber = random.nextInt(3)+1;
            System.out.println("Randomly generated number is:"+ randomNumber);
            if(randomNumber == 1){
                Medicine t = new Tablet();
                t.displayLabel();
            }
            else if(randomNumber == 2){
                Medicine s = new Syrup();
                s.displayLabel();
            }
            else{
                Medicine o = new Ointment();
                o.displayLabel();
            }
        }
    }
}
