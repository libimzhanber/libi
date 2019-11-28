import jeliot.io.*;
import java.util.*;

public class Q22  {
public static Scanner reader= new Scanner (System.in);
    public static void main() {
        // Your algorithm goes here.
        
         double ,grd1,grd2,grd3;
         double average;
         double grade;
         
final double MIN_GRD1 = 0;
final double MAX_GRD1 = 100;
final double MIN_GRD2 = 0;
final double MAX_GRD2 = 100;
final double MIN_GRD3 = 0;
final double MAX_GRD3 = 100;

        String name= reader.next();
        grd1= Input.readDouble();
        grd2= Input.readDouble();
        grd3= Input.readDouble();
        if ((grd1 < grd2) && (grd1 < grd3)){
            System.out.println(grd1+"lowest");
            }
         if ((grd2 < grd3) && (grd2 < grd1)){
            System.out.println(grd2+"lowest");
            }
          if((grd3 < grd2) && (grd3 < grd1)){
            System.out.println(grd3+"lowest");
        }
          if (((grd1 > grd2) && (grd1 > grd3)) && ((grd2 > grd3) && (grd2 > grd1))){
                average = ((grd1 + grd2) / 2.0) + 5;
                                                System.out.println(average);
                                                }
                                                
          if (((grd2 > grd1) && (grd2 > grd3)) && ((grd3 > grd1) && (grd3 > grd2))){
               average = ((grd1 + grd2) / 2.0) + 5;
                                                System.out.println(average);
                                                }
                                                
          if (((grd1 > grd2) && (grd1 > grd3)) && ((grd3 > grd1) && (grd3 > grd2))){
                 average = ((grd1 + grd2) / 2.0) + 5;
                                                System.out.println(average);
                                                }

}

}
