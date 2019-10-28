import jeliot.io.*;
import java.util.*;




public class MyClass {
public static Scanner reader = new Scanner (System.in);
    public static void main() {
       
            int num1, num2 ;
            
           
                System.out.println ("Please enter 2 numbers");
                num1 = reader.nextInt ();
                num2= reader.nextInt ();
                
                Couple c1= new Couple (num1, num2);
                Couple c2 ;
                
                
            if (c1.getNum1() < c1.getNum2()) {
                    c2= new Couple(c1.getNum1(), c1.getNum2());
                    }
                    
            else{
                    c2= new Couple (c1.getNum2(), c1.getNum1());
            }
            
            if ((c1.getNum1 () == c2.getNum1()) && (c1.getNum2()== c2.getNum2 ())) {
                    System.out.println ("same object");
                    
                    }