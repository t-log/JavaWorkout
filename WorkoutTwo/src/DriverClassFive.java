import java.util.Scanner;
class Tile{
    float edgeLength,area;
    Tile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter edge length of square in meters:");
        edgeLength = sc.nextFloat();
        area = edgeLength*edgeLength;
    }
}
class Floor{
    float length,width,area;
    Floor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floor length and width in meters:");
        length = sc.nextFloat();
        width = sc.nextFloat();
        area = length*width;
    }
    public void totalTiles(Tile t){
        System.out.println("Total no of tiles required:"+((int)(area/t.area)));
    }
}

public class DriverClassFive {
    public static void main(String[] args) {
        Tile t = new Tile();
        Floor f = new Floor();
        f.totalTiles(t);
    }
}
