import java.util.Scanner;
public class P4Q3Area
{
   static void returnArea(int x1,int x2)
   {
       int arr = x1*x2;
       System.out.println("area of your rectangle is: " + arr + " square units");
   }
   public static void main (String[]args)
   {
    Scanner input = new Scanner(System.in);
    System.out.println("enter length of the rectangle: ");
    int l= input.nextInt();
    System.out.println("enter breadth of the rectangle: ");
    int b = input.nextInt();
    System.out.println();
    returnArea(l,b);
    input.close();
   }
   
}