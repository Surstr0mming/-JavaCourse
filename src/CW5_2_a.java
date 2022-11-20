
import java.io.*;

public class CW5_2_a {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        int empty = 0;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                empty++;
            }
        }
        System.out.println("Number of empty lines: " + empty);
        fr.close();
    }
}