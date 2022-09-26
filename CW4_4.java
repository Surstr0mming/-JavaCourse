import java.util.Scanner;
import java.lang.Math;

public class CW4_4 {
    public static void main(String[] args) {
        double m_b, m_a, m_c, l_a, l_b, l_c, h_a, h_b, h_c, a, b, c, p, P, S;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c in same order(one line - one number):");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        m_b = (Math.sqrt(2 * (a * a + c * c) - b * b)) / 2;
        m_c = (Math.sqrt(2 * (a * a + b * b) - c * c)) / 2;
        m_a = (Math.sqrt(2 * (b * b + c * c) - a * a)) / 2;
        l_a = Math.sqrt(b * c * (a + b + c) * (b + c - a)) / (b + c);
        l_b = Math.sqrt(a * c * (a + b + c) * (a + c - b)) / (a + c);
        l_c = Math.sqrt(b * a * (a + b + c) * (b + a - c)) / (b + a);
        P = a + b + c;
        p = P/2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        h_a = 2 * S / a;
        h_b = 2 * S / b;
        h_c = 2 * S / c;
        System.out.println("The lengths of its medians :");
        System.out.printf("m_a = " + m_a + "\nm_b = " + m_b + "\nm_c = " + m_c);
        System.out.println("\nThe lengths of its bisectors :");
        System.out.printf("l_a = " + l_a + "\nl_b = " + l_b + "\nl_c = " + l_c);
        System.out.println("\nThe lengths of its height :");
        System.out.printf("h_a = " + h_a + "\nh_b = " + h_b + "\nh_c = " + h_c);
    }
}
