import java.util.Scanner;
public class HW2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the string: ");
        String sub_str = sc.nextLine();
        str = str.trim();

        String new_text = str.replace(sub_str,"");
        System.out.println(str);
    }
}