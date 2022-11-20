import java.io.*;

public class HW5_15 {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "HW11" + separator + "src" + separator + "test");
        BufferedReader br = new BufferedReader(fr);
        String line;
        StringBuilder str_wm = new StringBuilder();

        int count_r = 0, count_b = 0, count_g = 0, count_y = 0;
        int V_r = 0, V_b = 0, V_y = 0, V_g = 0, count_wm = 0;

        while((line = br.readLine()) != null) {
            line = line.replaceAll("\\s+", " ").trim();
            line = line.replaceAll("\\s+", " ");

            //part a
            if (line.charAt(line.indexOf(" ") + 1) == 'r'){
                String str1 = line.substring(0, line.indexOf(" "));
                int i1 = Integer.parseInt(str1);
                count_r += 1;
                V_r += Math.pow(i1, 3);
                }

            else if (line.charAt(line.indexOf(" ") + 1) == 'b') {
                String str2 = line.substring(0, line.indexOf(" "));
                int i2 = Integer.parseInt(str2);
                count_b += 1;
                V_b += Math.pow(i2, 3);
            }

            else if (line.charAt(line.indexOf(" ") + 1) == 'y') {
                String str3 = line.substring(0, line.indexOf(" "));
                int i3 = Integer.parseInt(str3);
                count_y += 1;
                V_y += Math.pow(i3, 3);
            }

            else {
                String str4 = line.substring(0, line.indexOf(" "));
                int i4 = Integer.parseInt(str4);
                count_g += 1;
                V_g += Math.pow(i4, 3);
            }

            //part b
            String str5 = line.substring(0, line.indexOf(" "));
            int i5 = Integer.parseInt(str5);
            if ((line.charAt(line.lastIndexOf(" ") + 1) == 'w' && i5  == 3) |
                    (line.charAt(line.lastIndexOf(" ") + 1) == 'm' && i5 > 5)){
                count_wm += 1;
                str_wm.append(line).append("\n");

            }
        }

        System.out.println("part a):");
        System.out.println("There are " + count_b + " blue cubes with V = " + V_b + "cm^3");
        System.out.println("There are " + count_r + " red cubes with V = " + V_r + "cm^3");
        System.out.println("There are " + count_y + " yellow cubes with V = " + V_y + "cm^3");
        System.out.println("There are " + count_g + " green cubes with V = " + V_g + "cm^3");

        System.out.println("part b):");
        System.out.println("There are " + count_wm + " cubes, which satisfy part b");
        System.out.println(str_wm);
        fr.close();
    }
}