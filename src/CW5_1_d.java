
import java.io.*;

public class CW5_1_d {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "test1");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "src" + separator + "outfile2");
        String line;

        while((line = br.readLine()) != null) {
            line = line.replaceAll("\\s+", " ").trim();
            line=line.replaceAll("\\s+", " ");
            System.out.println(line);
            fw.write(line + "\n");
        }
        fr.close();
        fw.close();
    }
}