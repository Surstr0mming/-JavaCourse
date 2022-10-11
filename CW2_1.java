import java.util.Scanner;

public class CW2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of rows in matrix :");
        int rows = in.nextInt();
        System.out.println("Enter amount of columns in matrix :");
        int columns = in.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("array[" + (i + 1) + "] [" + (j + 1) + "] = ");
                int m = in.nextInt();
                matrix[i][j] = m;
            }
        }
        System.out.println("Original matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter the element to sort same rows( from " + 1 + " to " + columns + " )");
        int k = in.nextInt();
        if (k >= 1 && k <= columns){
            int k_min;
            int buf = 0;
            int buf_numb;
            for (int i = 0; i < rows; i++){
                k_min = 2147483647;
                for (int j = i; j < rows; j++){
                    if (j != rows - 1){
                        if (k_min > matrix[j][k - 1]){
                            k_min = matrix[j][k - 1];
                            buf = j;
                        }
                    }
                    else if (i == rows - 1){
                        k_min = matrix[rows - 1][k - 1];
                        buf = j;
                    }
                    else{
                        if (matrix[rows - 2][k - 1] > matrix[rows - 1][k - 1]){
                            k_min = matrix[j][k - 1];
                            buf = j;
                        }
                    }
                }
                for (int d = 0; d < columns; d++){
                    buf_numb = matrix[i][d];
                    matrix[i][d] = matrix[buf][d];
                    matrix[buf][d] = buf_numb;
                }
            }
            System.out.println("Sorted matrix by " + (k + 1) + " column");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("There is no such columns. Restart the program");
        }
    }
}
