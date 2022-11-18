import java.util.*;

public class CW1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        "Enter type of work(1 - you enter string, 2 - constant string):
         */
        int n = 1;

        if (n == 1){
            System.out.println("Enter few words in one line using just one space behind words: ");
            String enter_input = sc.nextLine();

            String reversedString = new StringBuffer(enter_input).reverse().toString();
            System.out.println("Reversed string: " + reversedString);


        }

        else if (n == 2) {
            String const_input = "I open the door just a few times in a row";
            String reversedString = new StringBuffer(const_input).reverse().toString();
            System.out.println("Reversed string: " + reversedString);

        }

        else{
            System.out.println("You enter wrong number,there are no type of work");
        }
    }
}
