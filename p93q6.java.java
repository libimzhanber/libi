import jeliot.io.*;
import java.util.*;
public class MyClass {
public static Scanner reader = new Scanner (System.in);
    public static void main() {
        // p93q6
            int width;
            int length;
            
           length = reader.nextInt ();
            width = reader.nextInt ();
            
           
                System.out.println (" the surface is" +length* width);
            System.out.println (" the scope is" +(length*2+ width*2));
            
            
            if (length ==width) {
                         System.out.println ("The square is a square");
                }
                
                else {
                             System.out.println ("The square is not a square");
                             System.out.println ( length-width);
            }
            
    }
}
