import java.util.Scanner;

public class CW2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), mask = 1 << m, res = (n | mask) != n ? n| mask : n & ~mask;
        System.out.println(res);
    }
}
