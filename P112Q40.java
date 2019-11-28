import jeliot.io.*;
import java.util.*;
public class BooleanCheck {
  static Scanner reader = new Scanner (System.in);
    public static void main() {
        // Your algorithm goes here.
   
        
         int num1 = reader.nextInt();
           System.out.println("correct?" );
           boolean num1c = reader.nextBoolean();
         int num2 = reader.nextInt();
          System.out.println("correct?" );
             boolean num2c = reader.nextBoolean();
         int num3 = reader.nextInt();
          System.out.println("correct?" );
             boolean num3c = reader.nextBoolean();
        if ( num1c == true && num2c == true && num3c==true) {
                System.out.println("you get a prize ");
                }
                else {
                    System.out.println("you don't get a prize");
        }
    }
}
