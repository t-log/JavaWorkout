import java.util.*;

public class NumberInArray {

    static void find(int e,int[] x){
        for(int i=0;i<x.length;i++)
        {
            boolean flag = false;
            if(e==x[i])
            {
                System.out.println("Item found successfully");
                flag = true;
            }
            else
                //throw new ElementNotFoundException("Not Found");
                continue;
            try{
                if(flag==false)
                    throw new ElementNotFoundException("Not Found");
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
            }
            System.out.println(flag);

        }
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int number = reader.nextInt();

        int[] arr = new int[number];

        for(int i=0;i<number;i++)
        {
            arr[i] = reader.nextInt();
        }

        int element = reader.nextInt();

        find(element,arr);

    }


}
class ElementNotFoundException extends Exception {
    ElementNotFoundException(String msg) {
        super(msg);
    }
}
