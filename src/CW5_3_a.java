
import java.io.*;

public class CW5_3_a{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    fr.close();
    }
}