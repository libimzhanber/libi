import jeliot.io.*;
import java.util.*;
public class line{
    double AX,AY,BX,BY;
    double distancePointX;
    double distancePointY;
    public line(double AX,double AY,double BY,double BX){
            distancePointX = AX - BX;
            distancePointX = AY - BY;
            System.out.println(Math.sqrt(distancePointX*distancePointX + distancePointY*distancePointY));
     }
}
public class Points {
    static Scanner reader = new Scanner (System.in);
    public static void main() {

        double pointAX;
        double pointAY;
        double pointBX;
        double pointBY;
    
    pointAX = reader.nextDouble (); 
    pointAY = reader.nextDouble ();
    System.out.println ("("+pointAX+","+pointAY+")");
    pointBX = reader.nextDouble ();
    pointBY = reader.nextDouble ();
    System.out.println ("("+pointBX+","+pointBY+")");
    line s1=new line(pointAX , pointBX, pointAY ,pointBY);
    

    }
}

