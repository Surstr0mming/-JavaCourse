import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class graphic extends JFrame  {

    public static void main(String[] args) {
        graphic jf = new graphic();
        jf.setSize(1500, 1000);
        jf.setTitle("obolonka");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public graphic(){
        add(new greghem());
    }
}


class greghem extends JPanel {
    public void paint(Graphics g){
        String separator = File.separator;
        String path = separator + "D:" + separator + "java"
                + separator + "geometry" + separator + "src" + separator + "outfile2.txt";

        String path1 = separator + "D:" + separator + "java"
                + separator + "geometry" + separator + "src" + separator + "outfile3.txt";




        File file = new File(path);
        File file1 = new File(path1);

        FileReader fr;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FileReader fr1;
        try {
            fr1 = new FileReader(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);
        BufferedReader br1 = new BufferedReader(fr1);

        String line;
        int count1 = 0, k5_x = 0, k5_y = 0;

        while(true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            count1 += 1;

        }
        int[] mas_x = new int[count1/2];
        int[] mas_y = new int[count1/2];

        int count = 0;
        while(true) {
            try {
                if(count < 12){
                    System.out.println("22222222222222222");
                    if (!((line = br.readLine()) == null )) {
                        System.out.println("111111111111111111111");
                        if ((count) % 2 != 0) {

                            line = line.replaceAll("\\s+", " ").trim();
                            line = line.replaceAll("\\s+", " ");
                            int i111 = Integer.parseInt(br.readLine());
                            mas_y[k5_y] = 500 - i111 * 20;
                            k5_y += 1;
                        }
                        else {

                            line = line.replaceAll("\\s+", " ").trim();
                            line = line.replaceAll("\\s+", " ");
                            int i111 = Integer.parseInt(br.readLine());
                            mas_x[k5_x] = 500 - i111 * 20;
                            k5_x += 1;
                        }
                    System.out.println("count 1 = " + count);
                    count += 1;
                }
            }

            } catch (IOException e) {
                System.out.println("давай наново");
                break;
            }
        }

        int koef = 20;
        // draw the polygon using drawPolygon function
        //g.drawPolygon(mas_x, mas_y, count1/2);


        int[] max_x = new int[3];
        int[] max_y = new int[3];
        int k_max_x = 0 , k_max_y = 0;
        while (true){
            try {
                if (!((line = br1.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            for (int mp = 0; mp < 6; mp++){
                if (mp % 2 == 0){
                    int i111 = 0;
                    try {
                        i111 = Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    max_x[k_max_x] = 500 - i111 * 20;
                }
                else {
                    int i111 = 0;
                    try {
                        i111 = Integer.parseInt(br.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    max_y[k_max_y] = 500 - i111 * 20;
                }
            }
        }
        g.drawPolygon(max_x, max_y, 3);
        g.setColor(Color.BLUE);
        g.fillPolygon(max_x, max_y, count1/2);

    }
}