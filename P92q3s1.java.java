import jeliot.io.*;
 
public class average {
    public static void main() {
        // p92q3s1.

       //attributes
       int num1;
       int num2;
       double avg;
       
       num1=Input.readInt();
       num2=Input.readInt();;
       avg=(num1 + num2)/2.0;
      
       if ( avg<100) {
               System.out.println( "the average is " +avg);
           }
           else {
               System.out.println("the average is " +avg + " ,very good");
       }
       
    }
}