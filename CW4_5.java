public class CW4_5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No commandline argument");
        } else {
            int n = Integer.parseInt(args[0]);
            int c = n;
            for (int i = 1; i <= 999; i++) {
                if (i <= 9) {
                    System.out.print(i + "   ");
                } else if (i <= 99) {
                    System.out.print(i + "  ");
                } else {
                    System.out.print(i + " ");
                }
                if (i == n) {
                    System.out.println();
                    n += c;
                }
            }
        }
    }
}