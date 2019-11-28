import jeliot.io.*;

public class MyClass {
    public static void main() {
      System.out.println ("put psychometric grade"); 
      int psy = Input.readInt();
     System.out.println ("put math grade");
     int grade1 = Input.readInt(); 
     System.out.println ("put english grade"); 
      int grade2 = Input.readInt();
      System.out.println ("put computering grade"); 
      int grade3 = Input.readInt();
      System.out.println ("put arabic grade"); 
      int grade4 = Input.readInt();      
     int average = (grade1+grade2 +grade3 +grade4 ) / 4;
    
    if ( psy>= 690 && average>= 95){
       System.out.println ("you are in the hoog "); 
    }
    
     if (  ! (psy>= 690) && average>= 95){
       System.out.println ("do the psychometric test again "); 
    }
     if (   (psy>= 690) &&  ! (average>= 95)){
       System.out.println ("get higher bagrut grades "); 
    }    
    }
}