import java.util.*;

public class CW1_7 {

    public static int countChars(String text){
        String[] words = text.split(" ");

        return text.length();

    }

    public static int countWords(String text){
        String regex = "[\\p{Punct}\\s]+";
        String[] words = text.split(regex);

        return words.length;
    }

    public static int countPunctChars(String text){
        String regex = "[\\p{Punct}]+";
        String[] words = text.split(regex);

        return words.length-1;

    }

    public static int countSentences(String text){
        String regex = "[.?!]";
        String[] sentences = text.split(regex);

        return sentences.length;
    }

    public static void main(String[] args){
        if(args.length>0){
            String input = args[0];

            System.out.println("The number of characters in text = " + countChars(input));
            System.out.println("The number of words in text = " + countWords(input));
            System.out.println("The number of punctuation in text = " + countPunctChars(input));
            System.out.println("The number of sentences in text = " + countSentences(input));
        }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the string: ");
            String input = sc.nextLine();

            System.out.println("The number of characters in text = " + countChars(input));
            System.out.println("The number of words in text = " + countWords(input));
            System.out.println("The number of punctuation in text = " + countPunctChars(input));
            System.out.println("The number of sentences in text = " + countSentences(input));
        }
    }
}