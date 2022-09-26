import java.util.Arrays;
import java.util.Objects;

public class CW3_5 {
    public static void main(String[] args) {
        Object[] x = {1, 2, 3, 4, 5};
        Object[] y = {1.1, 2.2, 3.3, 4.4, 5.5};
        Object[] borders = {"--", "--", "--", "--", "--"};
        print(5, 'x', x);
        print(5, '-', borders);
        print(5, 'y', y);
    }
    public static void print(int n, char fill, Object[] mas) {
        System.out.print("\n" + fill + " | ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mas[i]);
            System.out.print(" | ");

        }
    }
}