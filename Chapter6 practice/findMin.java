import java.util.Scanner;

/**
 * Write a description of class findMax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class findMin
{
    public static double findMin(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a series of numbers or a  character to quit");
        
        double smallest= scan.nextDouble();
        while( scan.hasNextDouble()){
            double input= scan.nextDouble();
            if (input<smallest){
                smallest= input;
            }
        }
        return smallest;
    }
}
        
        