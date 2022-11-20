import java.io.*;
import java.util.*;

public class HW6_5_b{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements :");
        int n = sc.nextInt();
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "HW11" + separator + "src" + separator + "test1"));
        FileWriter fw1 = new FileWriter(separator + "D:" + separator + "java"
                + separator + "HW11" + separator + "src" + separator + "outfile2");

        int count = 0, max = -2147483648, i =0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            i += 1;
            System.out.println(i + ". " +nextInt);
            if (nextInt > max){
                max = nextInt;
            }
            if(count == n){
                fw1.write(max + " ");
                count = 0;
                max = -2147483648;
            }
            if(!textFile.hasNextInt()){
                fw1.write(max + " ");
            }

        }
        fw1.close();
    }
}
