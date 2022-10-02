import java.util.Scanner;

public class HW2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = n << 1;
        while(n != 0){
            n = n>> 1;
            System.out.printf("Number %d in binary %s\n", n, Integer.toBinaryString(n));
        }
    }
}
