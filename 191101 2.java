import jeliot.io.*;
import java.util.*;
public class MyClass {
public static Scanner reader = new Scanner(System.in);
    public static void main() {
   
     double num1;
     
     
     num1 = reader.nextDouble();
     
     
     if ((num1 == 1500) || (num1 == 1500.5) || (num1 == 1499.5))
     {
         System.out.println("normal speed");
         }
         else if (num1 < 1499.5)
       {
                      System.out.println("More oxygen should be added to increase the current speed is num 1 more meters per minute should be equal to at least 1500");
                      
    }
    else if (num1 > 1500.5)
    {
                System.out.println("More oxygen should be reduced to slow down The current speed is num1 Slow down more meters per minute for the speed to reach 1500 meters per minute Reduce the flow of oxygen by 2 * as much");
    }
    
    }
}