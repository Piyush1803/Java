import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int x[] = new int[n];
        System.out.println("Enter the element in the array ");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();



        System.out.println("Forward array");
        for (int i = 0; i < n; i++) {
            // System.out.print(" ");
            System.out.print(x[i]+" " );
        }
        System.out.println();



        System.out.println("Backward array");
        for (int i = n-1; i >= 0; i--) {
            System.out.print(x[i]+" " );
        }
        System.out.println();
    }
    

    
}
