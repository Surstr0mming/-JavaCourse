import java.util.Scanner;

public class CW3_7 {
    public static void main(String[] args) {
        double F, r, m_1, m_2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter m1, m2, r in same order(one line - one number):");
        m_1 = in.nextDouble();
        m_2 = in.nextDouble();
        r = in.nextDouble();
        F = 6.67e-11 * (m_1 * m_2) / (r * r);
        System.out.printf("F = %e", F);
    }
}
