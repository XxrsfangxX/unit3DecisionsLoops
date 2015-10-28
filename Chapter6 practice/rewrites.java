import java.util.Scanner;

/**
 * Write a description of class rewrites here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rewrites
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void r(){
Scanner in= new Scanner(System.in);
 System.out.println("Enter an int");
int n = in.nextInt();
double x = 0;
double s= 1.0;
while (s > 0.01)

{
 s = 1.0 / (1 + n * n);
 n++;
 x = x + s;
}

}
}
