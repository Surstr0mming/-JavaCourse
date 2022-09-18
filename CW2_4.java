import java.util.Scanner;

public class CW2_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Print number of degrees in Celsius");
        double C = in.nextDouble();
        double F = 9 * C/5 + 32;
        System.out.printf("F = %s", F);
    }
}
