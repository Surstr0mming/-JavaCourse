import java.util.Scanner;

public class CW1_4_lab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of number: ");
        int n = in.nextInt();
        int[] array = new int[n + 1];
        array[n] = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("number [" + (i + 1) + "] = ");
            array[i] = in.nextInt();
        }
        int[] res = find_max_repeats(array);
        System.out.printf("Number %d, %d times", res[1], res[0]);
    }

    public static int[] find_max_repeats(int[] array) {
        int[] res = {0, 0};
        int count = 1;
        int prev = 0;
        for (int a : array) {
            if (a != prev) {
                if (count > res[0]) {
                    res[0] = count;
                    res[1] = prev;
                } else if (count == res[0] && prev > res[1]) {
                    res[1] = prev;
                }
                count = 0;
            }
            prev = a;
            count += 1;
        }
        return res;
    }
}