import java.util.Scanner;
import java.lang.Math;

public class HW3_22 {
    public static void main(String[] args) {
        double a, b, c, P, S, p;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c in same order(one line - one number):");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        P = a + b + c;
        p = P/2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("P = " + P +" and S = " + S);
        a = 3;
        c = b = 3.5 + 3 * Math.pow(2, -111);
        P = a + b + c;
        p = P/2;
        S = Math.sqrt(P * (p - a) * (p - b) * (p - c));
        System.out.printf("\nPredefined variables: \nP = " + P +" and S = " + S);
    }
}
