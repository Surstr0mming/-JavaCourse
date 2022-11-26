// Java program to find convex hull of a set of points
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;
import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;


import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;
import java.util.Scanner;

class Point {
    int x, y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
}

public class GFG extends JPanel{
    // To find orientation of ordered triplet (p, q, r).
    // The function returns following values
    // 0 --> p, q and r are collinear
    // 1 --> Clockwise
    // 2 --> Counterclockwise
    public static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) -
                (q.x - p.x) * (r.y - q.y);

        if (val == 0) return 0; // collinear
        return (val > 0)? 1: 2; // clock or counterclock wise
    }


    /* Driver program to test above function */
    public static void main(String[] args) throws IOException {

        String separator = File.separator;



        String path = separator + "D:" + separator + "java"
                + separator + "geometry" + separator + "src" + separator + "outfile2.txt";


        String path1 = separator + "D:" + separator + "java"
                + separator + "geometry" + separator + "src" + separator + "outfile3.txt";





        FileWriter fw = new FileWriter(path);
        FileWriter fw1 = new FileWriter(path1);



        Point points[] = new Point[15];
        points[0]=new Point(0, 3);
        points[1]=new Point(2, 3);
        points[2]=new Point(1, 1);
        points[3]=new Point(2, 1);
        points[4]=new Point(3, 0);
        points[5]=new Point(0, 0);
        points[6]=new Point(3, 3);
        points[7]=new Point(4, 4);
        points[8]=new Point(7,0);
        points[9]=new Point(-5, -5);
        points[10]=new Point(-1, 4);
        points[11]=new Point(0, 7);
        points[12]=new Point(-3, 4);
        points[13]=new Point(4, -5);
        points[14]=new Point(3, -7);



        int n = points.length;
        // There must be at least 3 points
        if (n < 3) return;

        // Initialize Result
        Vector<Point> hull = new Vector<Point>();

        // Find the leftmost point
        int l = 0;
        for (int i = 1; i < n; i++)
            if (points[i].x < points[l].x)
                l = i;

        // Start from leftmost point, keep moving
        // counterclockwise until reach the start point
        // again. This loop runs O(h) times where h is
        // number of points in result or output.
        int p = l, q;
        do
        {
            // Add current point to result
            hull.add(points[p]);

            // Search for a point 'q' such that
            // orientation(p, q, x) is counterclockwise
            // for all points 'x'. The idea is to keep
            // track of last visited most counterclock-
            // wise point in q. If any point 'i' is more
            // counterclock-wise than q, then update q.
            q = (p + 1) % n;

            for (int i = 0; i < n; i++)
            {
                // If i is more counterclockwise than
                // current q, then update q
                if (orientation(points[p], points[i], points[q])
                        == 2)
                    q = i;
            }

            // Now q is the most counterclockwise with
            // respect to p. Set p as q for next iteration,
            // so that q is added to result 'hull'
            p = q;

        } while (p != l); // While we don't come to first
        // point

        // Print Result
        int i = 0;
        for (Point temp : hull) {
            System.out.println("(" + temp.x + ", " + temp.y + ")");
            i += 2;

        }

        int[] mas = new int[i];
        int j = 0;
        for (Point temp : hull) {
            mas[j] = temp.x;
            mas[j + 1] = temp.y;
            fw.write(mas[j] + "\n");
            fw.write(mas[j + 1] + "\n");
            j += 2;
        }

        double area = 0;
        double max_area = 0;
        double[] max_points = new double[6];

        //find max area
        for (int m1 = 0; m1 < i; m1 = m1 + 2){

            for (int m2 = m1 + 2; m2 < i; m2 = m2 + 2){

                for (int m3 = m2 + 2; m3 < i; m3 = m3 + 2){

                    area = 0.5 * ((mas[m1] * mas[m2 + 1] + mas[m2] * mas[m3 + 1] + mas[m3] * mas[m1 + 1]) -
                            (mas[m1 + 1] * mas[m2] + mas[m2 + 1] * mas[m3] + mas[m3 + 1] * mas[m1]));
                    area = Math.abs(area);

                    if(area >= max_area){

                        max_area = area;

                        max_points[0] = mas[m1];
                        max_points[1] = mas[m1 + 1];
                        max_points[2] = mas[m2];
                        max_points[3] = mas[m2 + 1];
                        max_points[4] = mas[m3];
                        max_points[5] = mas[m3 + 1];
                    }
                }
            }
        }
        //Show the results
        System.out.println("The triangle with the largest area with points: ");

        System.out.println("point 1 :\n(" + max_points[0] + ", " + max_points[1] + ")\n" +
                "point 2 :\n(" + max_points[2] + ", " + max_points[3] + ")\n"+
                "point 3 :\n(" + max_points[4] + ", " + max_points[5] + ")\n");

        for (int mp = 0; mp < 6; mp++){
            fw1.write(max_points[mp] + "\n");
        }

        System.out.println("Max area of triangle is : " + max_area);

        int[] mas_x = new int[i/2];
        int[] mas_y = new int[i/2];

        File file = new File(path);

        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        //append points in file for future graph
        String line;
        int count = 0, k5_x = 0, k5_y = 0;
        while((line = br.readLine()) != null) {
            line = line.replaceAll("\\s+", " ").trim();
            line=line.replaceAll("\\s+", " ");
            if ((count) % 2 != 0){
                mas_y[k5_y] = Integer.parseInt(line);
                k5_y += 1;
            }
            else{
                mas_x[k5_x] =  Integer.parseInt(line);
                k5_x += 1;
            }
            count += 1;
        }
        fw.close();
        fw1.close();
    }
}