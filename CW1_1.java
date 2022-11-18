import java.util.*;

public class CW1_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        "Enter type of work(1 - you enter string, 2 - constant string):
         */
        int n = 1;

        if (n == 1){
            System.out.println("Enter few words in one line using just one space behind words: ");
            String enter_input = sc.nextLine();

            int count = 0;
            if(enter_input.length() != 0){
                count++;
                for (int i = 0; i < enter_input.length() - 1; i++) {
                    if(enter_input.charAt(i) == ' '){
                        count++;
                    }

                }
            }
            System.out.println("there are " + count + " words");
        }

        else if (n == 2) {
            String const_input = "I open the door just a few times in a row";
            int count = 0;
            if(const_input.length() != 0){
                count++;
                for (int i = 0; i < const_input.length() - 1; i++) {
                    if (const_input.length() == ' '){
                        break;
                    }
                    if(const_input.charAt(i) == ' '){
                        count++;
                    }
                }
            }
            System.out.println("Const string: " +  const_input);
            System.out.println("You enter " + count + " words");
        }

        else{
            System.out.println("You enter wrong number,there are no type of work");
        }
    }
}