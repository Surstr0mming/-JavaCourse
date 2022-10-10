import java.util.Scanner;

public class CW1_6_lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of number: ");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("number [" + (i + 1) + "] = ");
            array[i] = in.nextInt();
        }
        String[] array_string = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            array_string[i] = Integer.toString(array[i]);
        }
        int max = array_max(array_string);
        System.out.print("Result: ");
        for (String a : array_string) {
            if (a.length() == max) {
                System.out.print(a + " ");
            }
        }
    }
    public static int array_max(String[] mas) {
        int max = 0;
        int length;
        for (String a : mas) {
            length = a.length();
            if (length > max) {
                max = length;
            }
        }
        return max;
    }
}