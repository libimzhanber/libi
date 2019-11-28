import jeliot.io.*;
import java.util.*;

public class Student {
    int g1;
    int g2;
    double finalGrd;
    int name;
        
    public Student(){
        this.name=name;
    }
    
    public int getGrd1(){
        return this.g1;
    }
    
       public int getGrd2(){
        return this.g2;
       }
       
       
       public void addGrd1(int g1){
           this.g1=g1;
       }
    
      public void addGrd2(int g2){
           this.g2=g2;
       }
       
    public int minGrd(){
        if(g1>g2)    
            return g2;
        else
            return g1;
        
    }

    public int maxGrd(){
        if(g1<g2)    
            return g2;
        else
            return g1;
    }
  
      public double avg(){ //return the avg
          return (g1+g2)/2.0;
      }
   
    public void addFinalGrd(double grd){ //set the final grade
        this.finalGrd=grd;
    }
    
    public double getFinalGrd(){ //get the final grade
        return this.finalGrd;
    }
    
    //
      
    
    }
    public class MyClass {
    public static void main() {
// p104q23


          int grd1,grd2;
         double grade;
         
        String name= Input.next();
        grd1= Input.readInt();
        grd2= Input.readInt();
        
        Student st = new Student(); // make oject Student
        st.addGrd1(grd1); //update grade1
        st.addGrd2(grd2);    //update grade2
        
         
        if (  0 < grd1 && grd1 < 100  &&  0 < grd2 && grd2 < 100 ) {
            System.out.println ("ok"); } 
        else {
            System.out.println("not ok");
    
//
    }
        }
    }