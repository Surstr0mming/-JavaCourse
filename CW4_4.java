import java.util.Scanner;

public class CW4_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = m;
        for (int i = 10; i <= 99; i++){
            System.out.print(" "+ i +" ");
            if (i == 10 + n - 1){
                System.out.println();
                n += m;
            }
        }
    }
}