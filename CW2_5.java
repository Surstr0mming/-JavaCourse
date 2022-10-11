import java.util.Scanner;

public class CW2_5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of rows in square matrix(rows = columns) :");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("array[" + (i + 1) + "] [" + (j + 1) + "] = ");
                int m = in.nextInt();
                matrix[i][j] = m;
            }
        }

        System.out.println("Original matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int buf_numb = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j){

                    buf_numb = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = buf_numb;
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