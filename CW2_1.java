import java.util.Scanner;

public class CW2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Type your surname");
        String surname = in.nextLine();
        System.out.printf("Hello, %s", surname);
    }
}
