import jeliot.io.*;
import java.util.*;

public class Couple {
     int num1;
     int num2;
     
     public  Couple (int num1, int num2) {
               this.num1 = num1;
               this.num2 = num2;
     }
     
     int getNum1() {
              return this.num1;
     }
     
      int getNum2() {
              return this.num2;
     }
      
     void setNum1 (int num1){
              this.num1 = num1;
      }
      void setNum2 (int num2){
              this.num2 = num2;
      }
      
      String toString(){
             return "num1: "+ this.num1 + "num2:" + this.num2;
      }
   }   
public class student {
    public static Scanner reader= new Scanner (System.in);
    public static void main() {