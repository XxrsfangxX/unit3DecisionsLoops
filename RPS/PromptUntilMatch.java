import java.util.Scanner;

/**
 * Write a description of class PromptUntilMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PromptUntilMatch
{
    public static void  promptUntilMatch(){
        boolean valid= false;
        double input;
        Scanner s= new Scanner(System.in);
        do 
        {
            System.out.print("Please enter a positoin value< 100");
            input= s.nextDouble();
            if(input>0&& input<100){
                valid= true;
            }
        }
        while(!valid);
        
    }   
}
