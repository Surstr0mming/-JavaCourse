
import java.io.*;

public class CW5_2_b {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line, max_line = "";
        int max_lenght = 0;

        while ((line = br.readLine()) != null) {
            if (line.length() > max_lenght) {
                max_lenght = line.length();
                max_line = line;
            }
        }
        System.out.println("Longest line is: \n" + max_line + "\n its length: " + max_lenght);
        fr.close();
    }
}