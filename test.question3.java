import jeliot.io.*;
import java.util.*;
public class MyClass {
public static Scanner reader = new Scanner(System.in);
    public static void main() {
   
int num1;

num1 = reader.nextInt();

if (num1 > 4)
{
    System.out.println("Buyer will have to pay 4 * 5 + num1 / 2 * (2 * 7)");
}
else if (num1 == 4)
{
            System.out.println("The buyer will have to pay 4 * 5");
}
else if (num1 < 4)
{
            System.out.println("The buyer will have to pay 4 * 5");
            }
    }
}