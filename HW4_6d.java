import java.lang.Math;
import java.util.Scanner;

public class HW4_6d {
    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 'x' :");
        x = in.nextDouble();
        System.out.println("f(x) = gauss(x) = " + Math.exp(- x * x));
        System.out.println("g(x) = gauss_derivative(x) = " + (-2 * x * Math.exp(- x * x)) );
    }
}
