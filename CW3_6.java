import java.util.Scanner;

public class CW3_6 {
    public static void main(String[] args) {
        String first, second;
        Scanner in = new Scanner(System.in);
        System.out.println("Print two strings:");
        first = in.nextLine();
        second = in.nextLine();
        System.out.print("!!! " + first + ", " + second + " !!!");
    }
}