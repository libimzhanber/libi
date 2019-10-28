import jeliot.io.*;
import java.util.*;
public class MyClass {
public static Scanner reader = new Scanner (System.in) ;
 public static void main() {
        //  p93q5
        
        int num;
        int num2;
        
        num = reader.nextInt ();
         num2 = reader.nextInt ();
       
         if (num>num2) {
                   System.out.println (num + "," +num2);
        }
        else { 
                   System.out.println(num2 + "," + num);
          }
                   
         if (num<num2) {
                   System.out.println (num + "," +num2);
        }
        else { 
                   System.out.println(num2 + "," + num);
               }
                   if (num>num2) {
                   System.out.println (num-num2);
        }
        else { 
                   System.out.println(num2 -num);
            }
        }
    }