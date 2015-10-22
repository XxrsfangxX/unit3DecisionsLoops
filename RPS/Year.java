import java.util.Scanner;

/**
 * Write a description of class Leap_year here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Year
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class Leap_year
     */
    public Year()
    {
        // initialise instance variables
        
    }

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
    public static void main(String []Args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your year");
        int y= s.nextInt();
        boolean year= Year.isLeapYear(y);
        if (year== true){
            
        System.out.println("This is a leap year");
        
    }
    else{
        System.out.println("This is a common year");
    }
}
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public static boolean isLeapYear(int y)
    {
        int x= y;
        if (x%4==0){
            if(x%100==0){
            if (x%400==0){
                return true;
            }
            else{return false;
            }
    }   
        else{
            return true;
        }
    }            
   else{
        return false;
        

}


}
}