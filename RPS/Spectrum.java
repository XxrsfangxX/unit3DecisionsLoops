import java.util.Scanner;


/**
 * Write a description of class Spectrum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spectrum
{
    /** description of instance variable x (add comment for each instance variable) */
  

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String [] args)
    {
        // put your code here
        Scanner s= new Scanner(System.in);
        System.out.println("What is the wavelenght");
        double x= s.nextDouble();
        if (x>0.1){
            System.out.println("Radio Wave");
    }
    else if (x>.003){
        System.out.println("Microwaves");
}
else if(x>.0000007){
    System.out.println("Infared");
}
else if (x>.0000004){
    System.out.println("Visible light");
}
else if(x>.00000001){
    System.out.println("Ultra Violet");
   
}
else if(x>.00000000001){
    System.out.println("xrays");
}
else
{
    System.out.println("Gamma rays");
}
}
}
