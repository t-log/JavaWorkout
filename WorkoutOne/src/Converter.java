import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        float fahren,celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        fahren = sc.nextFloat();
        celsius = ((fahren-32)*5)/9;
        System.out.println("Converted value to Celsius is:\n" + celsius);

    }
}
