import jeliot.io.*;
import java.util.*;
public class BooleanCheck {
  static Scanner reader = new Scanner (System.in);
    public static void main() {
        // Your algorithm goes here.
   
        
         int num1 = reader.nextInt();
         int num2 = reader.nextInt();
         boolean check ;
         check = num1>num2;
         if (check == true ) {
                 System.out.println(check + " num 1 is bigger then num 2" );
         }
         else {
                 System.out.println(check + " num2 is bigger then num1" );
                 }
         check = num1!=num2;
         if (check == true){
                 System.out.println (check + "num1 isn't wort to num2");
     }
             else {
                 System.out.println(check + "mum1 is wort to num2");
                          }

    }
}