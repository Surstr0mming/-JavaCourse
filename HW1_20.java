import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class HW1_20 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of number in array :");
        int n = in.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("array[" + (i + 1) + "] = ");
            int m = in.nextInt();
            list[i] = m;
        }
        int kgrow = 1, pgrow = 1;
        for (int i = 0; i < n; i++) {
            if (i + 1 == n) {
                if (list[i] > list[i - 1]) {
                    if (kgrow >= pgrow) {
                        pgrow = kgrow;

                    }
                }
                break;
            } else if (list[i] < list[i + 1]) {
                kgrow += 1;
                if (kgrow >= pgrow) {
                    pgrow = kgrow;
                }
            } else {
                kgrow = 1;
            }
        }


        int kdecline = 1, pdecline = 1;
        for (int i = 0; i < n; i++) {
            if (i + 1 == n) {
                if (list[i] < list[i - 1]) {
                    if (kdecline >= pdecline) {
                        pdecline = kdecline;
                    }
                }
                break;
            } else if (list[i] > list[i + 1]) {
                kdecline += 1;
                if (kdecline >= pdecline) {
                    pdecline = kdecline;
                }
            } else {
                kdecline = 1;
            }
        }

        System.out.println("Full array : " + Arrays.toString(list));
        if (Math.max(pdecline, pgrow) == pgrow) {
            int[] list_max = new int[pgrow];
            int k = 1, p = 1;
            int v = 0;
            for (int i = 0; i < n; i++) {
                if (i + 1 == n) {
                    if (list[i] < list[i - 1]) {
                        if (k == kgrow) {
                            for (int t = i + 1 - pgrow; t < i + 1; t++) {
                                for (int h = 0; h < pgrow - 1; h++) {
                                    list_max[h] = list[t];
                                }
                            }
                            System.out.println(Arrays.toString(list_max));
                            k = 1;
                            v = 0;
                        }
                    }
                    break;
                }
                else if (list[i] < list[i + 1]) {
                    k += 1;
                    if (k == kgrow) {
                        for (int t = i + 1 - pgrow; t < i + 1; t++) {
                            for (int h = 0; h < pgrow - 1; h++) {
                                list_max[h] = list[t];
                            }
                        }
                        System.out.println(Arrays.toString(list_max));
                        k = 1;
                        v = 0;
                    }
                    else {
                        k = 1;
                    }
                }

            }
        }
    }
}


