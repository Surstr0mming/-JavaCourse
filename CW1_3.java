import java.util.Scanner;
public class CW1_3 {
    public static void main(String[] args) {
        int n;
        double sum = 0f;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of numbers");
        n = in.nextInt();
        double[] numArray = new double[n];
        for(int i = 0; i < n; i++) {
            System.out.print("number [" + (i + 1) + "] = ");
            numArray[i] = in.nextDouble();
            sum+=numArray[i];
        }
        double mean = sum/n, stadrtdvtn = 0.0;
        System.out.println("Mean: " + mean);
        for(double num: numArray) {
            stadrtdvtn += Math.pow(num - mean, 2);
        }
        System.out.println("Sample standard Deviation: " + stadrtdvtn);
    }
}