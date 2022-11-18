public class CW1_6 {
    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Just a string ");
        String another = "that we use to illustrate the methods of class StringBuffer";

        sb.append(another);

        System.out.println("Modified string: ");
        System.out.println(sb);
    }
}