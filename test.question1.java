import jeliot.io.*;

public class MyClass {
    public static void main() {
      
int i; //אובייקט המייצג תלמידים
int j; //אובייקט המייצג כיסאות
int k; //אובייקט המייצג שולחנות

System.out.println("מספר התלמידים");
i = Input.readInt();
System.out.println("מספר הכיסאות");
j = Input.readInt();
System.out.println("מספר השולחנות");
k = Input.readInt();
if (i > j) {
    System.out.println("מספר התלמידים גדול ממספר הכיסאות");
    }
    else {    
    System.out.println("מספר הכיסאות גדול ממספר התלמידים");
    }
    if (i < j && i/2 >= k) {
    System.out.println ("מספר התלמידים קטן מספר הכיסאות וגם חצי ממספר התלמידים גדול שווה לשולחנות");
    }
    else {
    System.out.println("מספר התלמידים שווה למספר הכיסאות וגם חצי ממספר התלמדים קטן מהשולחנות");
    }
    }
}