import java.util.*;

public class CW1_3 {

    private static StringBuffer replaceWords(String str, String word1, String word2) {
        String words[] = str.split(" ");
        StringBuffer newSentence = new StringBuffer();
        for (String word: words){

            if (word1.equals(word)){
                newSentence.append(" ");
                newSentence.append(word2);
            }
            else{
                newSentence.append(" ");
                newSentence.append(word);
            }
        }
        return newSentence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter few words in one line using just one space behind words: ");
        String s = sc.nextLine();
        StringBuffer buf = replaceWords(s, "small", "very large");
        System.out.println(buf);
    }
}
