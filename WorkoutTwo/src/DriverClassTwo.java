import java.util.Scanner;

class OneBHK{
    protected float roomArea,hallArea,price;
    Scanner sc = new Scanner(System.in);
    OneBHK(){
        System.out.println("Enter Room area,Hall area,price:");
        roomArea = sc.nextFloat();
        hallArea = sc.nextFloat();
        price = sc.nextFloat();
    }
    OneBHK(float roomArea,float hallArea,float price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    public void show(){
        System.out.println("Room area:"+roomArea + '\n' + "Hall area:"+
                hallArea + '\n' + "Price:"+ + price);
    }
}
class TwoBHK extends OneBHK{
    private float room2Area;
    TwoBHK(){
        System.out.println("Enter Room 2 Area:");
        room2Area = sc.nextFloat();
    }
    TwoBHK(float room2Area){
        this.room2Area = room2Area;
    }
    public void show(){
        super.show();
        System.out.println("Room 2 area:"+room2Area);
    }
}

public class DriverClassTwo {
    public static void main(String[] args) {
        TwoBHK flat1 = new TwoBHK();
        flat1.show();
        TwoBHK flat2 = new TwoBHK(100);
        flat2.show();
        TwoBHK flat3 = new TwoBHK();
        flat3.show();
        System.out.println("Total amount of all flats:" +
                (flat1.price+flat2.price+flat3.price));
    }

}
