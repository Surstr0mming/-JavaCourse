import java.util.*;

public class CW1_4 {

    private static StringBuffer replaceWords(String str, String word1, String word2) {
        String words[] = str.split(" ");
        StringBuffer newSentence = new StringBuffer();
        for (String word: words){
            newSentence.append(word);
            newSentence.append(" ");

        }
        return newSentence;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter few words in one line using just one space behind words: ");
        String s = sc.nextLine();
        StringBuffer buf = replaceWords(s, "a", "an");
        System.out.println(buf);
    }
}
