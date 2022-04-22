import java.lang.Math;
public class P4Q2Triangle 
{ 
    static void area() 
   {
      int p=3+4+5;
      int s= p/2;
      double a = s*(s-3)*(s-4)*(s-5);
      double arr=Math.pow(a, 0.5);
      System.out.print("area of the triangle: " + arr + " unit square");  
   }

    static void perimeter()
   {
      int p=3+4+5;
      System.out.print("perimeter of the triangle: " + p + " units");
   }
     public static void main(String[]args)
     {
        System.out.println("sides of the triangle: 3 units , 4 units and 5 units");
        System.out.println();
        area();
        
        
        System.out.println("\n");
        perimeter();
        
     }
        
}