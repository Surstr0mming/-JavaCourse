import java.util.Scanner;

public class CW2_3 {
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
        int kgrow = 1, pgrow = 1, numb_max = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (j + 1 == m) {
                    if (matrix[i][j -1 ] > matrix[i][j]) {
                        if (kgrow == pgrow){
                            if (numb_max < matrix[i][j]){
                                numb_max = matrix[i][j];
                            }
                        }
                        else if (kgrow > pgrow) {
                            pgrow = kgrow;
                            numb_max = matrix[i][j];
                        }
                    }
                    break;
                }
                else if (matrix[i][j] < matrix[i][j + 1]) {
                    kgrow += 1;
                    if (kgrow == pgrow){
                        if (numb_max < matrix[i][j+1]){
                            numb_max = matrix[i][j + 1];
                        }
                    }
                    else if (kgrow > pgrow) {
                        pgrow = kgrow;
                        numb_max = matrix[i][j + 1];
                    }
                }
                else {
                    kgrow = 1;
                }
            }
        }
        System.out.println("Original matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Max number is : " + numb_max);
    }
}