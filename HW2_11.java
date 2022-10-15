import java.util.Scanner;

public class HW2_11{
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
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        boolean p;

        for (int i = 0; i < n; i++) {
            p = true;
            for (int j = 0; j < m; j++)
                if (matrix[i][j] != 0) {
                    p = false;
                    break;
                }
            if (p) {
                for (int k = i; k < (n - 1); k++)
                    System.arraycopy(matrix[k + 1], 0, matrix[k], 0, m);
                --i;
                --n;
            }
        }


        for (int j = 0; j < m; j++) {
            p = true;
            for (int i = 0; i < n; i++)
                if (matrix[i][j] != 0) {
                    p = false;
                    break;
                }
            if (p) {
                for (int k = j; k < (m - 1); k++)
                    for (int i = 0; i < m; i++)
                        matrix[i][k] = matrix[i][k + 1];
                --j;
                --m;
            }
        }

        System.out.println("Compacted matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}