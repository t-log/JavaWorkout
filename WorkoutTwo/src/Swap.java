class ObjSwap{
    int num1=7,num2=8;
}
public class Swap {
    public static void main(String[] args) {
        int num1=5,num2=6;
        System.out.println("Call by value:");
        swap(num1,num2);

        System.out.println("Call by reference:");
        ObjSwap obj = new ObjSwap();
        swap(obj.num1,obj.num2);

    }
    static void swap(int num1,int num2){
        System.out.println("Before swapping: "+"Number1= "+num1+" Number2= "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping:"+"Number1= "+num1+" Number2= "+num2);
    }
}
