import java.util.Scanner;
class Faculty{
    private int facultyId;
    protected float salary;
    Scanner sc = new Scanner(System.in);
    Faculty(){
        System.out.println("Enter Faculty Id:");
        facultyId = sc.nextInt();
    }
    public void displayData(){
        System.out.println("Faculty id:" + facultyId);
    }
}
class FullTimeFaculty extends Faculty{
    private float basic,allowance;
    FullTimeFaculty(){
        System.out.println("Enter basic and allowance:");
        basic = sc.nextFloat();
        allowance = sc.nextFloat();
        salary = basic + allowance;
    }
    public void displayData(){
        super.displayData();
        System.out.println("Basic:" + basic + "\n" + "Allowance:" + allowance + "\n" + "Salary:" + salary);
    }
}
class PartTimeFaculty extends Faculty{
    private float hour,rate;
    PartTimeFaculty(){
        System.out.println("Enter hour and rate:");
        hour = sc.nextFloat();
        rate = sc.nextFloat();
        salary = hour * rate;
    }
    public void displayData(){
        super.displayData();
        System.out.println("Hour:" + hour + "\n" + "Rate:" + rate + "\n" + "Salary:" + salary);
    }
}
public class DriverClassOne {
    public static void main(String[] args) {
        FullTimeFaculty f1 = new FullTimeFaculty();
        f1.displayData();
        FullTimeFaculty f2 = new FullTimeFaculty();
        f2.displayData();

        PartTimeFaculty p1 = new PartTimeFaculty();
        p1.displayData();
        PartTimeFaculty p2 = new PartTimeFaculty();
        p2.displayData();
    }
}
