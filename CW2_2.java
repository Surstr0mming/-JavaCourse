import java.util.Scanner;

public class CW2_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of rows in matrix:");
        int n = in.nextInt();
        System.out.println("Enter amount of columns in matrix:");
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("array[" + (i + 1) + "] [" + (j + 1) + "] = ");
                int k = in.nextInt();
                matrix[i][j] = k;
            }
        }
        System.out.println("Original matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter the amount of shift left ");
        int k = in.nextInt();
        for (int i = 0; i < m; i++) {
            int real_steps = k % m;
            while (real_steps-- > 0) {
                int temp = matrix[i][0];
                for (int j = m - 1; j >= 0; j--) {
                    int buf = matrix[i][j];
                    matrix[i][j] = temp;
                    temp = buf;
                }
            }
        }
        System.out.println("New matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}