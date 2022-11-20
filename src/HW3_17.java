public class HW3_17{
    public static StringBuffer Words(String s) {
        StringBuffer newSentence = new StringBuffer();
        String newString;
        for (String val: s.split(" ")) {
            if ((val.charAt(0) >= 65 && val.charAt(0) <= 90) | (val.charAt(0) >= 97 && val.charAt(0) <= 122)) {
                newSentence.append(val);
                newSentence.append(" ");
            }
        }
        return newSentence;
    }

    public static void main(String args[])
    {
        String str = "sky is over +38 2444-241 +45 +56 23-45-547 red and blue ";
        StringBuffer buf = Words(str);
        System.out.println(buf);

    }
}