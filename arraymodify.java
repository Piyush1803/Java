import java.util.Scanner;

public class arraymodify {
    static void modify(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i] + i;
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = sc.nextInt();
    int[] a3 = new int[n];
    System.out.println("Enter the elements of array ");
    
    for (int i = 0; i < n; i++) {
        a3[i] = sc.nextInt();
    }
    modify(a3);
    for(int i = 0; i<n; i++){
        System.out.print(a3[i]);
    }
    sc.close();
}}
