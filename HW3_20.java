public class HW3_20 {
    static void out_number(int... a) {
        System.out.println("Amount of arguments: " + a.length);
        if (a.length == 0) System.out.print("No arguments ");
        else System.out.print("Arguments :");
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        out_number(12123,123123, 5656);
        out_number(1, 2, 3, 4, 5, 6, 7);
        out_number(-34, -65, -67, -4545);
        out_number();
    }
}