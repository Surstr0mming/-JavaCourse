import java.util.Scanner;
public class CW1_1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        String[] mas =  new String[n];
        for (int i = 0; i< n; i++){
            mas[i] = "value " + (i + 1) + "\n";
        }
        for (String x : mas){
            System.out.println(x);
        }
    }
}