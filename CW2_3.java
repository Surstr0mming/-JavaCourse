public class CW2_3 {
    public static void main(String[] args) {
        char a = 'm';
        System.out.println(char_to_binary(a));
    }
    public static String char_to_binary(char a){
        return Integer.toBinaryString(a);
    }

}
