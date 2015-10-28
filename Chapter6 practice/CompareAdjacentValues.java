import java.util.Scanner;
public class CompareAdjacentValues
{
    public static void detectAdjacentDuplicate(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit.");
        double input= scan.nextDouble();
        while( scan.hasNextDouble()){
            double previousInput= input;
            input= scan.nextDouble();
            if (input== previousInput){
                System.out.println("Duplicate Adjacent Values!!");
            }
        }
    }
}