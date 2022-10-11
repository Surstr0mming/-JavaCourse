import java.util.Scanner;

public class CW2_4{
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
        int sum = 0, k1 = 0, k2 = 5;
        for(int i = 0; i < n; i++){
            k1 = 0;
            k2 = 0;
            System.out.println("");
            for (int j = 0; j < n; j++){
                if (matrix[i][j] > 0){
                    k1 = j;
                    for(int p = j + 1; p < m; p++){
                        if(matrix[i][p] > 0){
                            k2 = p;
                            break;
                        }
                    }
                    break;
                }
            }
            System.out.println("i = " + i);
            System.out.println("k1 " + k1);
            System.out.println("k2 " + k2);
            if (k2 - k1 > 1){
                for(int t = k1 + 1; t < k2; t++){
                    System.out.println("matrix " + matrix[i][t]);
                    sum += matrix[i][t];
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}