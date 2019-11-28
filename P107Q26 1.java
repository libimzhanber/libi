import jeliot.io.*;

public class MyClass {
    public static void main() {
  
    int a;
    int b;
    int c;
    int min;
    
    a=Input.readInt();
    b=Input.readInt();
    c=Input.readInt();
   
  if(a>b)
  min=a;
 else
 min=b;
   
  if(c>min)
  min=c;
  System.out.println("the lowest number"+min);

    }
}
