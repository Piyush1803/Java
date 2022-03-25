import java.util.Scanner;
import java.lang.Math;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        System.out.println("Enter c: ");
        int c = sc.nextInt();
        if (a == 0) {
            System.out.println("It is not a Quadratic eq.");
        }
        sc.close();

        double D = b * b - 4 * a * c;
        double Dsqrt, x1, x2;
        Dsqrt = Math.sqrt(D);

        if (D > 0) {
            x1 = (-b + Dsqrt) / 2 * a;
            x2 = (-b - Dsqrt) / 2 * a;
            System.out.println("the roots of quadratic equations: \nx1=" + x1 + "\nx2=" + x2);

        } else if (D == 0) {
            x1 = -b / 2 * a;
            x2 = -b / 2 * a;
            System.out.println("the roots of quadratic equations: \nx1=" + x1);
        }

        else {
            System.out.println("equation has no real roots");
        }

    }

}
