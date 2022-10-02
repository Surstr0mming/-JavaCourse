import java.lang.*;

public class HW2_17 {

    public static void main(String[] args) {
        int i = 170;
        System.out.println("Number = " + i);
        System.out.println("Binary = " + Integer.toBinaryString(i));
        int b = 0;
        while (i!=0){
            b<<=1;
            b|=( i &1);
            i>>=1;
        }
        System.out.println("Reversed number = "+ b);
        System.out.println("Reversed binary = " + Integer.toBinaryString(b));

    }
}