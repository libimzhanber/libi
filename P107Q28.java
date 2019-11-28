import jeliot.io.*;
import java.util.*;

public class Student {
      double grd,grd1,grd2,grd3; 
  //Setters & Getters
  public void setGrd (double Grd) {
          if (grd >= MIN_GRD && grd <= MAX_GRD) {
              this.grd = grd;
      
          } 
          }
  }
public class School {
public static Scanner reader= new Scanner (System.in);
    public static void main() {
        // Your algorithm goes here.

        boolean String_name;
        String_name = true;
        String Student = reader.next();
       
     
  double grd;
  double grd1;
  double grd2;
  double grd3;
  
   //Constrants
   final double MIN_GRD = 0;
   final double MAX_GRD = 100;
              
          
        grd1 = reader.nextDouble();
        grd2 = reader.nextDouble();  
        grd3 = reader.nextDouble();

if ((grd1 < grd2) && (grd1 < grd3));
    grd1 = grd1*1.1;
    System.out.println (grd1+"the end grd");
if ((grd2 < grd3) && (grd2 < grd1));
    grd2 = grd2*1.1;
    System.out.println (grd2+"the end grd");
if ((grd3 < grd2) && (grd3 < grd1));
    grd3 = grd3*1.1;
    System.out.println (grd3+"the end grd");
    
if (((grd2 < grd1) && (grd1 < grd3)) || ((grd3 < grd1)&& (grd1 < grd2)));
    grd1 = grd1*1.05;
    System.out.println(grd1+"the end grd");
if (((grd1 < grd2) && (grd2 < grd3)) || ((grd2 < grd1)&& (grd3 < grd2)));
    grd2 = grd2*1.05;
    System.out.println(grd2+"the end grd");
if (((grd2 < grd3) && (grd1 < grd3)) || ((grd1 < grd3)&& (grd3 < grd2)));
    grd3 = grd3*1.05;
    System.out.println(grd3+"the end grd");
     }
}