import java.util.Scanner;

public class Employee {
    String name,result;
    int empId;
    float ass1,ass2,ass3;
    Scanner sc = new Scanner(System.in);
    Employee(){
        System.out.println("Enter employee name & id:");
        name = sc.nextLine();
        empId = sc.nextInt();
        System.out.println("Enter 3 assessment values:");
        ass1 = sc.nextFloat();
        ass2 = sc.nextFloat();
        ass3 = sc.nextFloat();
        if(ass1>75 && ass2>75 && ass3>75){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Demoted");
        }
    }
    public float total(){
        float total = ass1+ass2+ass3;
        return total;
    }
    public void percentage(){
        System.out.println("Percentage:"+((total()/300)*100));
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.total());
        e.percentage();
    }
}
